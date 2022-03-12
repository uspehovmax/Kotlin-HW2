/**
 * Program for counting commission of money transaction
 *
 */
fun main() {
    //три суммы в копейках
    val amount = 100_00
    val amount2 = 21_500_00
    val amount3 = 325_00

    println(" ------ УСЛОВИЯ ПЕРЕВОДА ------ ")
    println(" КОМИССИЯ 0,75%, но не менее 35 рублей ")
    println()
    println("Комиссия за перевод $amount копеек составит ${fee(amount)} копеек")
    println("Комиссия за перевод $amount2 копеек составит ${fee(amount2)} копеек")
    println("Комиссия за перевод $amount3 копеек составит ${fee(amount3)} копеек")

}

fun fee(amount: Int): Int {
    val feePercent = 0.0075
    val minimalFee = 3500
    val result: Int
    if (amount * feePercent < minimalFee) {
        result = minimalFee
    } else {
        result = (amount * feePercent).toInt()
    }
    return result
}