package core.basesyntax;

public class Rectangle extends Figure {
    private final int sideA;
    private final int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        this.color = color;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        double area = sideA * sideB;
        return Math.round(area * 100.0) / 100.0;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: " + getArea()
                + " sq.units, side A: " + sideA
                + " units, side B: " + sideB
                + " units, color: " + color;
    }
}
