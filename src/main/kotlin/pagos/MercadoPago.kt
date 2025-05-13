package pagos

class MercadoPago : MedioDePago {
    var comision: Double = 0.2
    var montoTotal: Double = 0.0

    override fun calcularMontoFinal(montoBase: Double): Double {
        val comision: Double = montoBase * this.comision
        this.montoTotal = montoBase + comision
        return this.montoTotal
    }
}