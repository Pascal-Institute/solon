//Assets : 개인이나 기업이 보유하고 있는 경제적 가치
data class Assets(val equity: Equity, val liabilities: Liabilities){
    fun getTotal() : Double{
        return equity.getTotal() + liabilities.getTotal()
    }
}
