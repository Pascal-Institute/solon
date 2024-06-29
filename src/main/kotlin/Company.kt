class Company {
    //Default is A Million Dollars
    var assets = Assets(Equity(1.0), Liabilities(2.0))

    fun isCapitalErosion() : Boolean{
        return assets.getTotal() < assets.liabilities.getTotal()
    }
}