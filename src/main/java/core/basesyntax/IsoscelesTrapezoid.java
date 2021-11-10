package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int shortSide;
    private int longSide;
    private int height;

    public IsoscelesTrapezoid(int shortSide, int longSide, int height, String color) {
        super("Trapezoid", color);
        this.shortSide = shortSide;
        this.longSide = longSide;
        this.height = height;
    }

    public IsoscelesTrapezoid() {

    }

    @Override
    public double getArea() {
        return height * ((shortSide + longSide) / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + super.getType() + " area: " + getArea() + " sq.units, "
                      + "heigth: " + height + " units, "
                      + "short side " + shortSide + " units, "
                      + "long side " + longSide + " units, "
                      + "color: " + super.getColor());
    }
}
