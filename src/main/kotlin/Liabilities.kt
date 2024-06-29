//Liabilities : 자산을 얻기 위해 회사가 외부에서 차입한 자금
data class Liabilities(var currentValue : Double, var nonCurrentValue : Double){

    //currentValue(유동 부채) : 1년 안에 갚아야 되는 부채
    //nonCurrentValue(비유동 부채) : 만기가 1년 이상 남아 있는 부채

    fun getTotal() : Double{
        return currentValue + nonCurrentValue
    }
}
