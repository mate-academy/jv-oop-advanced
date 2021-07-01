package core.basesyntax;

public class Circle extends Figure {

    public Circle(String name, int r, String color) {
        super(name, color);
        setArea((Math.PI * r * r));
    }

    @Override
    public String toString() {
        return "Figure: " + this.getName()
                + ", area: " + this.getArea() + " sq.units, "
                + "color: " + this.getColor();
    }
}
