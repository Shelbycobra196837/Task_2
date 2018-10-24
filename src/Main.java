public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Рекс", "12", "10");
        Cat cat = new Cat("Вася", "18", "5");
        dog.say(cat);
        cat.say(dog);
    }
}
