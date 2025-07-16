package core.basesyntax;

public class Rectangle extends Figure implements WithArea {

    private int width;
    private int height;
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Figure: "
                + "rectangle, "
                + "area: " + getArea() + " sq. units, "
                + "big base: " + width + " units, "
                + "height: " + height + " units, "
                + "color: " + color;
    }
}
