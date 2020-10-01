open class Employee : StaffMember() {
    protected var socialSecurityNumber: String = ""
    protected var payRate: Double = 0.0

    override fun pay(): Double {
        return 1000.0
    }

    override fun toString(): String {
        return super.toString() + "\n" + socialSecurityNumber + "\n" + payRate
    }
}