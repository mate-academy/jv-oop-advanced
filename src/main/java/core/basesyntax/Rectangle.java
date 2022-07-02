package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    Rectangle() {
        setName("Rectangle");
        setColor(new ColorSupplier().getRandomColor());
        this.sideA = getRandom().nextInt(getMaxNumber());
        this.sideB = getRandom().nextInt(getMaxNumber());
    }

    Rectangle(double sideA, double sideB, Color color) {
        setName("Rectangle");
        setColor(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + area()
                + " sq.units, side a: " + sideA + "units, side b: "
                + sideB + " units, color: " + getColor());
    }
}
