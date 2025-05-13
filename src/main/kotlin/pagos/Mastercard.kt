package pagos

import java.time.DayOfWeek
import java.time.LocalDate

class Mastercard : MedioDePago {
    var comision = 0.0
    var montoTotal = 0.0
    private val diaActual: LocalDate = LocalDate.now()

    override fun calcularMontoFinal(montoBase: Double): Double {
        if (diaActual.dayOfWeek == DayOfWeek.of(6) || diaActual.dayOfWeek == DayOfWeek.of(7)) {
            this.comision = montoBase * 0.3
            this.montoTotal = montoBase + this.comision
        } else {
            this.comision = montoBase * 0.075
            this.montoTotal = montoBase + this.comision
        }
        return this.montoTotal
    }
}