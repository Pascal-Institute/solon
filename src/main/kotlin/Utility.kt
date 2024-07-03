class Utility {
    companion object{
        fun Double.toDollar() : Double {
            return this * 1000000
        }

        fun Double.toMillion() : Double {
            return this * 0.0000001
        }
    }
}