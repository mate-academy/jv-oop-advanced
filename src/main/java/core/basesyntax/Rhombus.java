package core.basesyntax;

public class Rhombus extends Figure {
    private final double side;
    private final double height;

    public Rhombus(String name, String color, double side, double height) {
        super(name, color);
        this.side = side;
        this.height = height;
    }

    @Override
    public double getArea() {
        return side * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + "; " + "Area: " + getArea() + " sq.units; "
                + "Color: " + getColor() + ".");
    }
}
