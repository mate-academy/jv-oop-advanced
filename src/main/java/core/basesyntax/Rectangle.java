package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;
    private String rectangleColor = new Figure().getColor();

    public Rectangle(int sideA, int sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.rectangleColor = color;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, sideA: " + sideA
                + " sq. units, sideB: " + sideB + " units, color: " + rectangleColor);
    }
}
