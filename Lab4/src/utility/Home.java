package utility;

import java.util.Objects;

public class Home {
    private Color color;
    private String Place;

    public Home(String Place, String colorName){
        color = Color.valueOf(colorName);;
        this.Place = Place;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getPlace() {
        return Place ;
    }

    public void setPlace(String place) {
        this.Place = place;
    }

    public String homeName() {
        if (color == Color.RED){
            return "в доме с краснойдверью";
        }
        else if (color == Color.BLUE) {
            return "в доме с синей дверью";
        }
        else if (color == Color.GREEN) {
            return "в доме с зеленой дверью";
        }
        else if (color == Color.ORANGE) {
            return "в доме с оранжевой дверью";
        }
        else{
            return "в доме с желтой дверью";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Home home = (Home) o;
        return color == home.color && Place.equals(home.Place);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, Place);
    }
}
