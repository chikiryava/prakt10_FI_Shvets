import kotlin.math.roundToInt

class Motiv(override val name:String, override val priceforminute: Double, override val square: Double, private val p:Boolean):OperatorInterface {
    override fun Q(): Double {
        if(p==true)
            return 0.7*super.Q()
        else
            return 1.5*super.Q()
    }

    override fun Info(): String {
        return "Оператор $name, "+
                "Стоимость минуты разговора $priceforminute, "+
                "Площадь покрытия $square, "+
                "Стоимость звонка ${Q()}"
    }
}