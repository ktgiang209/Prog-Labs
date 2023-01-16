package utility;

public abstract class DirectionAbstract implements DirectionInterface{
    private boolean smallperson;

    public DirectionAbstract(boolean smallperson) {
        this.smallperson = smallperson;
    }

    @Override
    public boolean isSmallperson() {
        return smallperson;
    }

    @Override
    public void setSmallperson(boolean smallperson) {
        this.smallperson = smallperson;
    }
}
