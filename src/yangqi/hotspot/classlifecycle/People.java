package yangqi.hotspot.classlifecycle;

public class People extends Creature {

    private String name;

    private int    age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People [name=" + name + ", age=" + age + "]";
    }

    public void speak() {
        System.out.println("I say hello");
    }

}
