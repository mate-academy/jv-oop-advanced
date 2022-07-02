package core.basesyntax;

public class RightTriangle extends Figure {
    private double sideA;
    private double sideB;

    RightTriangle() {
        setName("Right triangle");
        setColor(new ColorSupplier().getRandomColor());
        this.sideA = getRandom().nextInt(getMaxNumber());
        this.sideB = getRandom().nextInt(getMaxNumber());
    }

    RightTriangle(double sideA, double sideB, Color color) {
        setName("Right triangle");
        setColor(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return sideA * sideB / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + area()
                + " sq.units, side a: " + sideA + "units, side b: "
                + sideB + " units, color: " + getColor());
    }
}
