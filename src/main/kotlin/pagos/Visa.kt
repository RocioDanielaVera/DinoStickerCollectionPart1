package pagos

import java.time.LocalTime

class Visa  : MedioDePago {
    var comision:Double = 0.0
    var montoTotal:Double = 0.0
    val horaActual: LocalTime = LocalTime.now()


    override fun calcularMontoFinal(montoBase: Double): Double {
        if(horaActual in LocalTime.of(15,0,0)..LocalTime.of(22,30,0)){
            this.comision = montoBase * 0.1
            this.montoTotal = montoBase + this.comision
        } else {
            this.comision = montoBase * 0.5
            this.montoTotal = montoBase + this.comision
        }
        return this.montoTotal
    }
}