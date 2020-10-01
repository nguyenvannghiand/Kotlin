class Woman : Person() {
    private var wearingMakeup: Boolean = false
    public var WearingMakeup: Boolean
        get() {
            return wearingMakeup
        }
        set(value) {
            wearingMakeup = value
        }
}