public class Balloon {
    private String color;
    enum color {
        BLUE,
        GREEN,
        RED,
        YELLOW,
        ORANGE
    }
    public Balloon(String colorName) {
        color = colorName;
    }
}
