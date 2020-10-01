class Hourly:Employee() {
    private var hourWorked: Int = 0
    public fun addHours(moreHour:Int){
        hourWorked = moreHour
    }

    override fun pay(): Double {
        return hourWorked * 50.0
    }

    override fun toString(): String {
        return super.toString() + "\n" + hourWorked
    }
}