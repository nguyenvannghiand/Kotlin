open abstract class StaffMember {
    protected var name: String = ""
    protected var address: String = ""
    protected var phone: String = ""
    override fun toString(): String {
        return name +"\n" + address +"\n" + phone
    }
    public abstract fun pay():Double
}