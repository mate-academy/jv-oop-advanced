package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator, Info {
    private int sideA;
    private int sideB;

    Rectangle(int sideA, int sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        setColor(color);
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + getArea()
                + " sq.units, sideA: " + sideA + " units, sideB: "
                + sideB + " units, color: " + getColor());
    }
}
