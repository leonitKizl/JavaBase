package TEST;

public enum Enumm {
    Winter("Cold"),
    Summer("Hot"),
    Spring("Not hot yet"),
    Autumn("Not cald yet");

    private final String s;

    Enumm(String s) {
        this.s = s;
    }

    public String getDesription(){
        return s;
    }
}
