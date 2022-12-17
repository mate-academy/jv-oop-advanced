package core.basesyntax;

public class Rectangle implements Figure {
    private final Color color;
    private double sideA;
    private double sideB;

    public Rectangle(Color color, double sideA, double sideB) {
        this.color = color;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return (sideA * sideB);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: rectangle, area: " + this.getArea()
                + " sq. units, side A: " + sideA + " units, side B: " + sideB + " color: " + color);
    }

}
