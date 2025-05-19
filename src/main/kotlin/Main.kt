package org.dinostickers.collection

import org.dinostickers.collection.data.User
import org.dinostickers.collection.repositories.StickersCollectionRepository
import org.dinostickers.collection.repositories.StickersRepository
import org.dinostickers.collection.repositories.UserRepository
import pagos.Mastercard
import pagos.MedioDePago
import pagos.MercadoPago
import pagos.Visa

fun main() {
    do {
        loginMenu()
        println("Nickname:")
        val nickname = readlnOrNull() ?: "Unknown"
        println("Password:")
        val password = readlnOrNull() ?: "Unknown"
        if (UserRepository.verifyUser(nickname, password)) {
            do {
                val user = UserRepository.login(nickname, password)
                userMenu(user?.nickName)
                var opcion = readln().toIntOrNull() ?: 4
                when(opcion){
                    1 -> {
                        payMenu(user?.nickName, user?.money)
                        try {
                            var payment: MedioDePago? = choosePayment()
                            chooseSticker(payment, user)
                        }catch (e: Exception){
                            println("ERROR: El medio de pago ingresado no es valido. $e")
                        }
                    }
                    2 -> showCollectionByUserId(user)
                    3 -> println("Gracias por utilizar nuestro sistema.")
                    else -> println("Ingrese un valor valido.")
                }
            }while (opcion != 3)
        }
    }while (!UserRepository.verifyUser(nickname, password))
}

fun loginMenu(){
    println("""
       ________________________________________________________________________________
       |                                                                              | 
       |                              L O G I N                                       | 
       |______________________________________________________________________________|
       | Bienvenido, Ingrese sus datos.                                               | 
       |______________________________________________________________________________|
    """.trimIndent())
}

fun userMenu(nickname: String?){
    println("""
       _________________________________________________________________________________
       |                                                                               | 
       |                              M E N U                                          | 
       |_______________________________________________________________________________|
       | USER: $nickname                                                             
       | 1. Comprar stickers.                                                          |
       | 2. Mostrar Colección.                                                         |
       | 3. Salir.                                                                     |
       ---------------------------------------------------------------------------------
       Ingrese la opcion deseada:
    """.trimIndent())
}

fun payMenu(nickname: String?, money:Double?){
    println("""
       _________________________________________________________________________________
       |                                                                               | 
       |                       M E D I O S  D E  P A G O                               | 
       |_______________________________________________________________________________|
       | USER: $nickname                                 DISPONIBLE: $$money           
       | 1. MERCADO PAGO                                                               |
       | 2. VISA                                                                       |
       | 3. MASTERCARD                                                                 |
       ---------------------------------------------------------------------------------
       Ingrese el medio de pago deseado:
    """.trimIndent())
}

fun discountTotalAmount(user:User, total: Double): String{
    if(user.money < total){
        return "No se pudo realizar el pago."
    }
    user.money = (user.money - total)
    return """
        Se realizó el pago exitosamente: $$total
        Saldo: $${user.money}"
    """.trimIndent()
}

fun choosePayment(): MedioDePago?{
    var opcion = readln().toIntOrNull()?:4
    return when (opcion) {
        1 -> MercadoPago()
        2 -> Visa()
        3 -> Mastercard()
        else -> null!!
    }
}

fun chooseSticker(payment: MedioDePago?, user: User?){
    println("""
        ATENCION: CADA PAQUETE CONTIENE 5 FIGURITAS.
        Ingrese la cantidad de paquetes de figuritas que desea comprar:
    """.trimIndent())
    try{
        val figuritas:Int = readln().toInt()
        if(figuritas <= 0 ){
            throw IllegalArgumentException("Debe ingresar un número mayor a cero.")
        }
        val sticker:List<Long> = StickersRepository.getRandomPackOfStickersByTotal(figuritas)
        StickersCollectionRepository.addStickersToCollectionByUserId(sticker, user?.id !!)
        val totalStickers = StickersCollectionRepository.get(user.id).flatMap { it.stickers }.size
        println("Ahora tiene $totalStickers stickers.")
        val montoBase = StickersRepository.getTotalPrice(figuritas)
        println(discountTotalAmount(user, payment?.calcularMontoFinal(montoBase) !!))
        println("PAGO FINALIZADO.")
    }catch(e: NumberFormatException){
        println("ERROR: La cantidad ingresada de paquetes de figuritas es inválida. $e")
    }catch (e: IllegalArgumentException){
        println("ERROR: ${e.message}")
    }
}

fun showCollectionByUserId(user: User?){
    println(StickersCollectionRepository.showStickersCollection(user))
}