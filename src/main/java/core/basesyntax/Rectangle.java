package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB, String color) {
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
        System.out.println("Figure : Rectangle " + "color: " + getColor()
                + " side A " + String.format("%.2f", sideA)
                + " side B " + String.format("%.2f", sideB)
                + " area: " + String.format("%.2f", getArea()) + '}');
    }
}
