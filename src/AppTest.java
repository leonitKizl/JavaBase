public class AppTest {

    public static void main(String[] args) {
        AppAndroid maps = new AppAndroid("Maps");
//        maps.appInfo();
        maps.runAndroidApp();

        AppIphone spotik = new AppIphone("Spotify");
//        spotik.appInfo();
        spotik.runIphoneApp();
    }
}
