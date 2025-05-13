package pagos

interface MedioDePago {
    fun calcularMontoFinal(montoBase: Double): Double
}