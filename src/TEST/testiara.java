package TEST;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class testiara {

    public static void main(String[] args) {

        String[] names = new String[]{"elli", "Belli", "Karapuzelli"};
        int i = 0;
        while (names[i] != "Karapuzelli") {
            System.out.println(names[i]);
            i++;
        }

        String bella = "bella";
        StringBuilder sb = new StringBuilder(bella);

        for (int j = 0; j < bella.length() / 2; j++){
            char firstSymbol = bella.charAt(j);
            sb.setCharAt(j,sb.charAt(sb.length() - 1 -j));
            sb.setCharAt((sb.length() - 1 -j),firstSymbol);
        }
        System.out.println(sb);
        //
        System.out.println(Enumm.Summer);
        Enumm day = Enumm.Summer;
        System.out.println(day.getDesription());;

        Browser currentBrows = Browser.CHROME;
        currentBrows.getDescr();
        Set<String> strs = new HashSet<>(List.of("1","2","adw","awdadadwawd"));
        List<Integer> ints = new ArrayList<>(List.of(1,2,3,4,5,67));
        System.out.println(ints);
//        ints.get(11);
        System.out.println(strs);

        List<Browser> allBrs = new ArrayList<>(List.of(currentBrows));
        allBrs.get(0).sout("smth");
        Set<String> rep = new HashSet<>(List.of("adw","daw"));
        rep.add("dawa");
        rep.remove("adw");
        System.out.println(rep);

    }
}
