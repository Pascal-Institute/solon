//Liabilities : 자산을 얻기 위해 회사가 외부에서 차입한 자금
data class Liabilities(var value : Double){
    fun getTotal() : Double{
        return value
    }
}
