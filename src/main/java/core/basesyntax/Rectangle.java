package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;
    private String rectangleColor;

    public Rectangle(double sideA, double sideB, String rectangleColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.rectangleColor = rectangleColor;
    }

    @Override
    public double calculateArea() {
        double rectangleArea = sideA * sideB;
        rectangleArea = (double) Math.round(rectangleArea * 100) / 100;
        return rectangleArea;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + Rectangle.class.getSimpleName()
                + ", area: " + calculateArea()
                + " sq.units, sideA: " + sideA
                + " units, sideB: " + sideB + " units"
                + ", color: " + rectangleColor);
    }
}
