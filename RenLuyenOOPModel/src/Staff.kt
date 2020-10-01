class Staff {
    private var staffList: MutableList<StaffMember> = mutableListOf()
    public fun addStaff(staff: StaffMember) {
        staffList.add(staff)
    }
    public fun payDay() {
        for (item in staffList) {
            println(item.pay())
        }
    }
}