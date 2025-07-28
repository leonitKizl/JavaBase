public class AutoMethods {

    public static void main(String[] args) {
        AutoTestConstructor mecedes = new AutoTestConstructor();
        mecedes.info();
        AutoTestConstructor reno = new AutoTestConstructor("Reno","Auto",2024,100000);
        reno.info();

        System.out.println(reno.speed(2,100));;
        System.out.println(mecedes.speed(10,200));

    }

}
