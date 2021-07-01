package core.basesyntax;

public class Square extends Figure {

    public Square(String name, int a, String color) {
        super(name, color);
        setArea(a * a);
    }

    @Override
    public String toString() {
        return "Figure: " + this.getName()
                + ", area: " + this.getArea() + " sq.units, "
                + "color: " + this.getColor();
    }
}
