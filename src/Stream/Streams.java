package Stream;

import Interfejs.ChromeDriver;
import Interfejs.FirefoxDriver;
import Interfejs.Webdriver;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(List.of("Adam","Max","Leon","Lexa","Liawon"));
        names.add("Lena");
        names.add("Leonard");

        List<String> normalNames = names.stream().filter(name -> name.startsWith("L"))
                .toList();

        for (int i = 0;i < normalNames.size();i++){
            System.out.println(normalNames.get(i));
        }

        List<String> upperNames = names.stream().map(name -> name.toUpperCase()).toList();
        for (int i = 0;i < upperNames.size();i++){
            System.out.println(upperNames.get(i));
        }

        List<Webdriver> drivers = new ArrayList<>(List.of(new FirefoxDriver(),new ChromeDriver()));
        drivers.add(new ChromeDriver());
        for (Webdriver dr : drivers){
            dr.get();
        }

        List<Integer> nums = new ArrayList<>(List.of(1,2,3,4,5,6,7,0));
        nums.remove(0);
        System.out.println(nums.get(0));
        List<String> st = new LinkedList<>();
        st.add("dawd");




    }
}
