public class Cat extends Animal {

    public Cat(String name, String weight, String age) {
        super(name, weight, age);
    }

    @Override
    public void say() {
        System.out.println("МУР-МУР-МУР!Я-кот убийца!!");
    }

    public void say(Dog dog) {
        System.out.println(getName() + "- Пщщщщщщщ не дождёшься вредный пёс!!!");
        run();
    }

    public void run() {
        System.out.println("Кот убегает");
    }
}
