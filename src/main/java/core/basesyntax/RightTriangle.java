package core.basesyntax;

public class RightTriangle extends Figure implements ShapeAreaCalculator, ShapePropertyDisplay {
    private double sideLength;

    private double heightOfTheTriangle;

    private static final double VALUE_WITH_FORMULA = 0.5;

    @Override
    public double calculateArea() {
        return VALUE_WITH_FORMULA * sideLength * heightOfTheTriangle;
    }

    @Override
    public void displayProperty() {
        System.out.println("Figure: right triangle, color is " + color + ", size of the side is " + sideLength
                + ", size of the height " + heightOfTheTriangle + ", area: " + calculateArea());
    }
}

