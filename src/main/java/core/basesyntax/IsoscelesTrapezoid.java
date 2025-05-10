package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height = 2;
    private int averageLine = 5;

    public IsoscelesTrapezoid() {
        this.setName("isosceles trapezoid");
        this.setColor(ColorSupplier.generateColor());
    }

    @Override
    public double getArea() {
        return averageLine * height;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(": " + getName() + ", area: " + getArea()
                + " sq. units, height: " + height + " units, averageLine: "
                + averageLine + " units, color: " + getColor());
    }
}
