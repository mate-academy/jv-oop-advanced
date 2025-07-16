package core.basesyntax;

public class Square extends Figure implements WithArea {

    private int side;
    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Figure: "
                + "square, "
                + "area: " + getArea() + " sq. units, "
                + "side: " + side + " units, "
                + "color: " + color;

    }
}
