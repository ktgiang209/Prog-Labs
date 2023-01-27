package utility;

public class Balloon {
    private Color color;
    private Size size;
    public Balloon(String colorName, String size) {
        color = Color.valueOf(colorName);
        this.size = Size.valueOf(size);

    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getColorName() {
        if (color == Color.RED){
            return "красный";
        }
        else if (color == Color.BLUE) {
            return "синий";
        }
        else if (color == Color.GREEN) {
            return "зеленый";
        }
        else if (color == Color.ORANGE) {
            return "оранжевый";
        }
        else{
            return "желтый";
        }
    }
    public String getBalloonSize(){
        if(size == Size.BIG){
            return "большой-пребольшой";
        } else if (size == Size.VERYBIG) {
            return "большущий";
        } else {
            return "маленький";
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Balloon) {
            return color == ((Balloon) obj).getColor() && size == ((Balloon) obj).getSize();
        }
        return false;
    }

    @Override
    public String toString() {
        return "Balloon{" +
                "color=" + color +
                ", size=" + size +
                '}';
    }
}
