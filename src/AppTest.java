import java.util.ArrayList;
import java.util.List;

public class AppTest {

    public static void main(String[] args) {
        AppAndroid maps = new AppAndroid("Maps");
//        maps.appInfo();
        maps.runAndroidApp();

        AppIphone spotik = new AppIphone("Spotify");
//        spotik.appInfo();
        spotik.runIphoneApp();
        System.out.println("LIST");

        List<App> aps = new ArrayList<>(List.of(maps,spotik));
        for (App app : aps){
            app.appInfo();

        }
    }
}
