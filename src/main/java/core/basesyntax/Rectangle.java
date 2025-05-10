package core.basesyntax;

public class Rectangle extends Figure {
    private float sideA;
    private float sideB;
    private double area;

    public Rectangle(Color color, float sideA, float sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.area = getArea();
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName() + ", area: " + area
                + " sq.units, sideA: " + sideA + " units, sideB: " + sideB + " units, color: "
                + getColor());
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
