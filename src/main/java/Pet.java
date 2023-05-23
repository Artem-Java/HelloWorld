public class Pet {
    String name;
    int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void Sound() {
        System.out.println("Издаёт некий звук");
    }

    @Override
    public String toString() {
        return "Питомец{" +
                "по имени='" + name + '\'' +
                ", возраст=" + age +
                '}';
    }
}
