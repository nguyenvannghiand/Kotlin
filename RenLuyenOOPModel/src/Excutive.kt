class Excutive: Employee() {
    protected var bonus: Double = 0.0
    public fun awardBonus(excecBonus:Double){
        println(excecBonus)
        bonus = excecBonus
    }

    override fun pay(): Double {
        return super.pay() * 1.15
    }
}