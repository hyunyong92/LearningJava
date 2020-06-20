package hyunyong.learning;

public class Person {
    private String name;
    // TODO : Person에다가 age을 추가한다. (필드) age는 int. 값을 setter, getter

    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {this.age = age;}
    public String getName() {
        // TODO : implement
        return name;
    }

    public int getAge() {
        return age;
    }
}
