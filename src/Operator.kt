abstract class Operator (val name:String,val priceforminute:Double,val square:Double){

    constructor(priceforminute: Double,square: Double) : this(" ",priceforminute,square)

    open fun Q():Double {
        return (100*square)/priceforminute
    }
    abstract fun Output():String
}