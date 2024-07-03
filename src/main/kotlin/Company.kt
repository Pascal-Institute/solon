//회사가 돈을 버는 방법, 1.장사 2.증자

class Company {
    //Default is A Million Dollars
    var assets = Assets(Equity(1.0), Liabilities(2.0, 3.0))

    //Default is A Dollar
    var stockPrice = 1.0

    fun isCapitalErosion() : Boolean{
        return assets.equity.getTotal() < assets.liabilities.getTotal()
    }
}