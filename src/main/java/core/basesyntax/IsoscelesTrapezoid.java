package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements ShapeAreaCalculator, ShapePropertyDisplay {
    private static final int VALUE_WITH_FORMULA = 2;

    private double sizeOfTheHeight;

    private double sizeOfTheSmallerBase;

    private double sizeOfTheLargeBase;

    public IsoscelesTrapezoid(String color, double sizeOfTheHeight,
                              double sizeOfTheSmallerBase, double sizeOfTheLargeBase) {
        this.color = color;
        this.sizeOfTheHeight = sizeOfTheHeight;
        this.sizeOfTheSmallerBase = sizeOfTheSmallerBase;
        this.sizeOfTheLargeBase = sizeOfTheLargeBase;
    }

    @Override
    public double calculateArea() {
        return ((sizeOfTheLargeBase + sizeOfTheSmallerBase) / VALUE_WITH_FORMULA) * sizeOfTheHeight;
    }

    @Override
    public void displayProperty() {
        System.out.println("Figure: isosceles trapezoid, color is " + color + ", size of the height is "
                + sizeOfTheHeight + ", size of smaller base: " + sizeOfTheSmallerBase + "Area: " + calculateArea());
    }
}
