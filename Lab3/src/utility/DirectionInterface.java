package utility;

public interface DirectionInterface extends ThingInterface {
    DirectionType getType();
    boolean isSmallperson();
    void setSmallperson(boolean smallperson);
}