package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements WithArea {

    private int smallBase;
    private int bigBase;
    private int height;
    @Override
    public double getArea() {
        return (double) (smallBase + bigBase) * height / 2;
    }

    @Override
    public String toString() {
        return "Figure: "
                + "isosceles trapezoid, "
                + "area: " + getArea() + " sq. units, "
                + "smallBase: " + smallBase + " units, "
                + "bigBase: " + bigBase + " units, "
                + "height: " + height + " units, "
                + "color: " + color;
    }
}
