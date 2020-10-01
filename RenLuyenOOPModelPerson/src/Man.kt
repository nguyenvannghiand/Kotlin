class Man : Person() {
    private var watchingFootball: Boolean = false
    public var WatchingFootball: Boolean
        get() {
            return watchingFootball
        }
        set(value) {
            watchingFootball = value
        }
}