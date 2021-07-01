package core.basesyntax;

public class RightTriangle extends Figure {

    public RightTriangle(String name, int a, int b, String color) {
        super(name, color);
        setArea(a * b / 2);
    }

    @Override
    public String toString() {
        return "Figure: " + this.getName()
                + ", area: " + this.getArea() + " sq.units, "
                + "color: " + this.getColor();
    }
}
