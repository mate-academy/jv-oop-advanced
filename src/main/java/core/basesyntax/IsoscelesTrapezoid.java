package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sizeOfTheHeight;
    private double sizeOfTheSmallerBase;
    private double sizeOfTheLargeBase;

    public IsoscelesTrapezoid(String color, double sizeOfTheHeight,
                              double sizeOfTheSmallerBase, double sizeOfTheLargeBase) {
        super(color);
        this.sizeOfTheHeight = sizeOfTheHeight;
        this.sizeOfTheSmallerBase = sizeOfTheSmallerBase;
        this.sizeOfTheLargeBase = sizeOfTheLargeBase;
    }

    @Override
    public double calculateArea() {
        return ((sizeOfTheLargeBase + sizeOfTheSmallerBase) / 2) * sizeOfTheHeight;
    }

    @Override
    public void displayProperty() {
        System.out.println("Figure: isosceles trapezoid, color: " + super.getColor()
                + ", size of the height: " + sizeOfTheHeight + ", size of smaller base: "
                + sizeOfTheSmallerBase + ", area: " + calculateArea());
    }
}
