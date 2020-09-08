package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if(name == null || name.isEmpty() || name.length() > 40){
            throw new IllegalArgumentException("Name must be not null, not empty and < 40 length");
        }
        this.name = name;
        if(age < 0 || age > 120){
            throw new IllegalArgumentException("Age must be >0 and <120");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
