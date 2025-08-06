package TEST;

public enum Browser {
    CHROME("Web"),
    SAFARI("Mobile"),
    FIREFOX("FF"),
    IE("IE");

    private final String ie;

    Browser(String ie) {
        this.ie = ie;
    }

    public void getDescr(){
        System.out.println(ie);
    }
    public void sout(String abra){
        System.out.println(abra);
    }
}



