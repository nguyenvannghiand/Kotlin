class MyClass: MyInterface {
    override fun doAble() {
        println("day la noi dung doAble cua MyClass")
    }

    override fun makeAble() {
        super.makeAble()
        println("MakeAble cua MyClass")
    }
}