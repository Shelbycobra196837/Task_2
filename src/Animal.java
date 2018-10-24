abstract class Animal implements IVote {

    private String name;
    private String weight;
    private String age;

    public String getName() {
        return name;
    }
    //А нужны ли гетеры и сетеры в абстрактном классе?

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Animal(String name, String weight, String age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
}
