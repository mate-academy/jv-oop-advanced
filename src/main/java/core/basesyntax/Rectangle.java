package core.basesyntax;

public class Rectangle extends Figure {
    private final double sideA;
    private final double sideB;

    public Rectangle(double sideA, double sideB, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.setName("Rectangle");
    }

    @Override
    public double getArea() {
        return sideB * sideA;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: "
                + String.format("%.2f",this.getArea()) + " sq.units, side A: "
                + String.format("%.2f", sideA) + " units, side B: "
                + String.format("%.2f", sideB) + " units, color: " + getColor());
    }
}
