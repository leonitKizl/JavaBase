public class Student {

    public String name;
    public int age;
    public String lastName;
    public String email;

    public void przedstawSie() {
        System.out.println("My name is " + name + " " + lastName + ". I am " + age);
    }

    public void zalogujSie() {
        System.out.println("Logue sie za pomoca " + email);
    }
}
