package Abstract;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    void info() {
        System.out.println("My name is " + name);
    }
}
