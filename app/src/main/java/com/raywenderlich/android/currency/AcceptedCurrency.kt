package com.raywenderlich.android.currency

sealed class AcceptedCurrency {

    abstract val valueInDollar: Double

    var amount: Double = 0.0

    val name: String
        get() = when (this) {
            is Dollar -> "Dollar"
            is Euro -> "Euro"
            is Cryto -> "NerdCoin"
        }

    fun totalValueInDollars(): Double {
        return amount * valueInDollar
    }
}

class Dollar : AcceptedCurrency() {
    override val valueInDollar: Double = 1.0
}

class Euro : AcceptedCurrency() {
    override val valueInDollar: Double = 1.25

}

class Cryto : AcceptedCurrency() {
    override val valueInDollar: Double = 2534.92

}