fun main() {
    var dsStaff: Staff = Staff()
    var people1 = Excutive()
    var people2 = Hourly()
    people2.addHours(5)
    var people3 = Excutive()
    dsStaff.addStaff(people1)
    dsStaff.addStaff(people2)
    dsStaff.addStaff(people3)
    dsStaff.payDay()
}