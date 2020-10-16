@Excel(name = "Cat")
public class Cat extends Animal implements Say {
    // Public fields
    public static final String SAY = "MEO MEO";
    public static final int NUMBER_OF_LEGS = 4;

    // Private fields
    @ExcelColumn(index = 0, title = "Name")
    private String name;
    @ExcelColumn(index = 1, title = "Age")
    private int age;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int getNumberOfLegs() {
        return NUMBER_OF_LEGS;
    }

    @Override
    public String say() {
        return SAY;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
