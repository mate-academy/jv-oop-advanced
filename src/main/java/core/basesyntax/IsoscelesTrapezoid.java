package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double middleLine;

    IsoscelesTrapezoid() {
        setName("Isosceles trapezoid");
        setColor(new ColorSupplier().getRandomColor());
        this.height = getRandom().nextInt(getMaxNumber());
        this.middleLine = getRandom().nextInt(getMaxNumber());
    }

    IsoscelesTrapezoid(double height, double middleLine, Color color) {
        setName("Isosceles trapezoid");
        setColor(color);
        this.height = height;
        this.middleLine = middleLine;
    }

    @Override
    public double area() {
        return height * middleLine;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + area()
                + " sq.units, height: " + height + "units, middle line: "
                + middleLine + " units, color: " + getColor());
    }
}
