interface OperatorInterface {
    val name:String
    val priceforminute:Double
    val square: Double
    fun Q():Double{
        return (100*square)/priceforminute
    }
    fun Info():String{
            return "Оператор $name, "+
                    "Стоимость минуты разговора $priceforminute, "+
                    "Площадь покрытия $square, "+
                    "Стоимость звонка ${Q()}"
    }
}