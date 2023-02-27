import kotlin.math.roundToInt

class MTS(name:String, priceforminute: Double, square:Double, public var p:Boolean):Operator(name,priceforminute,square){

    constructor(name:String,priceforminute: Double,square: Double):this(name,priceforminute,square,true)

    var qt:Double = 0.0
    override fun Q():Double{
        if(p==true)
            return 0.7*super.Q()
        else
            return 1.5*super.Q()
    }
    override fun Output(): String {
        return "Оператор $name, "+
                "Стоимость минуты разговора $priceforminute, "+
                "Площадь покрытия $square, "+
                "Стоимость звонка ${Q()}"
        }

}