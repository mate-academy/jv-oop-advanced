package core.basesyntax;

public class Rectangle implements Figure, FigureDraw {
    private double rectangleSideA;
    private double rectangleSideB;
    private String color;

    public Rectangle(double rectangleSideA, double rectangleSideB, String color) {
        this.rectangleSideA = rectangleSideA;
        this.rectangleSideB = rectangleSideB;
        this.color = color;
    }

    @Override
    public double getArea() {
        return rectangleSideA * rectangleSideB;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq. units, sideA: " + rectangleSideA + " units, sideB: " + rectangleSideB
                + " units, color: " + color);
    }
}
