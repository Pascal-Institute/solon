//Assets : 개인이나 기업이 보유하고 있는 경제적 가치
data class Assets(val equity: Equity, val liabilities: Liabilities){

    //유동 자산 : 1년이내에 돈이 되는 자산
    var currentValue = getTotal()

    //비유동 자산 : 돈이 되는데 1년 이상 걸리는 자산
    var nonCurrentValue = getTotal() - currentValue

    fun setCurrentValue(value : Double){
        currentValue = value
        nonCurrentValue = getTotal() - currentValue
    }

    fun getTotal() : Double{
        return equity.getTotal() + liabilities.getTotal()
    }
}
