package core.basesyntax;

public class Rectangle extends Figure {

    public Rectangle(String name, int a, int b, String color) {
        super(name, color);
        setArea(a * b);
    }

    @Override
    public String toString() {
        return "Figure: " + this.getName()
                + ", area: " + this.getArea() + " sq.units, "
                + "color: " + this.getColor();
    }
}
