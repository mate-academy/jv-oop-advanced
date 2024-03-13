package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int firstBase;
    private int secondBase;

    @Override
    public String drawArea() {
        return "Figure: isoscelesTrapezoid, "
                + "area: " + (firstBase + secondBase) / 2 * height + " sq. units, "
                + "height: " + height + " units, "
                + "firstBase: " + firstBase + " units, "
                + "secondBase: " + secondBase
                + "color: " + getColor()
                + '}';
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setFirstBase(int firstBase) {
        this.firstBase = firstBase;
    }

    public void setSecondBase(int secondBase) {
        this.secondBase = secondBase;
    }
}
