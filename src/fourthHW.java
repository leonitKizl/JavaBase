public class fourthHW {

    public static void main(String[] args) {
        Student leon = new Student();
        leon.name = "Leon";
        leon.lastName = "Kazlouski";
        leon.age = 30;
        leon.email = "test@mail.ru";

        Student swin = new Student();
        swin.email = "swiniara@mdaw.ru";
        swin.age = 25;
        swin.lastName = "Swintuzski";
        swin.name = "Swin";

        Student pop = new Student();
        pop.name = "Pop";
        pop.lastName = "Amerika";
        pop.age = 40;
        pop.email = "Krutoj";

        Student[] allStudents = new Student[]{leon,swin,pop};
        for (int i = 0; i < allStudents.length; i++){
            allStudents[i].przedstawSie();
            allStudents[i].zalogujSie();
        }
    }
}
