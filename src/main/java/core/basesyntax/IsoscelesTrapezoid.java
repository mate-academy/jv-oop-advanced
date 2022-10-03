package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double side1;
    private final double side2;
    private final double height;

    public IsoscelesTrapezoid(String color, double side1, double side2, double height) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }

    @Override
    public String name() {
        return String.valueOf(Figures.ISOSCELESTRAPEZOID);
    }

    @Override
    public double getArea() {
        return ((side1 * side2) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name() + ", area: " + getArea()
                + " sq.units, side1: " + this.side1
                + " units, side2: " + this.side2
                + " units, color: " + getColor());
    }
}
