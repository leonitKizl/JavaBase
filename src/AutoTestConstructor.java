import java.util.Scanner;

public class AutoTestConstructor {

    String marka;
    String model;
    int rok;
    int przebieg;
    String country;

    public AutoTestConstructor(String marka, String model, int rok, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.rok = rok;
        this.przebieg = przebieg;
        System.out.println("Object of class is created");
    }
    public AutoTestConstructor(){

    }
    public void info(){
        System.out.println("Marka is " + marka);
        System.out.println("Model is " + model);
        System.out.println("Rok is " + rok);
        System.out.println("Przebieg is " + przebieg);
        System.out.println();
    }

    public double speed(int time,int s){
        System.out.print(marka + ". Speed is " + s/time);
        return s/time;
    }

}
