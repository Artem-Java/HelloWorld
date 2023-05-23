public class Person {
    String name;
    int age;

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    void talk() {
        System.out.println(this.name + " talking");
    }

    void move() {
        System.out.println("Пользователь: " + this.name + " в возрасте: " + this.age + " лет умеет неплохо двигаться");
    }

    @Override
    public String toString() {
        return "Пользователь {" +
                "Имя = '" + name + '\'' +
                ", возраст = " + age +
                '}';
    }
}
