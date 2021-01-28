package world;

public class Plant {
    public String name; //can access from anywhere
    public static final int id=7;   //can access from anywhere
    private String type;    //within the class only
    protected String size;  //within the package and outside pkg by subclass only
    int height;     //within the pkg only

    public Plant(){
        name="freddy";
        type="plant";
        size="medium";
        height=10;
    }
}
