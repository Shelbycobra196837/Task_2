public class Dog extends Animal {

    public Dog(String name, String weight, String age) {
        super(name, weight, age);
    }

    @Override
    public void say() {
        System.out.println("Гав");
    }

    public void say(Cat cat) {
        System.out.println(getName() + "- Я сожру тебя мерзкий КОТ!!");
    }
}
