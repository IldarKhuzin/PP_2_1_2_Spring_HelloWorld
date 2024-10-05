import org.springframework.context.annotation.Scope;
public class Cat {

    private String name;

    private int age;

    public Cat(){}

    public String getName() { return name; }

    public int getAge() { return age; }

    public void setAge(int age) {this.age = age;}

    public void setName(String name) {this.name = name;}

}
