package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double sideA;
    private final double sideB;
    private final double height;

    public IsoscelesTrapezoid(String name,String color,double sideA,double sideB,double height) {
        super(name, color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((sideA + sideB) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + "; " + "Area: " + getArea() + " sq.units; "
                + "Color: " + getColor() + ".");
    }
}
