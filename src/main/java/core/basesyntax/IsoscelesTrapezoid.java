package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double smallBase;
    private double largeBase;

    public IsoscelesTrapezoid(String color, double height,
                              double smallBase, double largeBase) {
        super(color);
        this.height = height;
        this.smallBase = smallBase;
        this.largeBase = largeBase;
    }

    @Override
    public double calculateArea() {
        return ((largeBase + smallBase) / 2) * height;
    }

    @Override
    public void displayProperty() {
        System.out.println("Figure: isosceles trapezoid, color: " + super.getColor()
                + ", size of the height: " + height + ", size of small base: "
                + smallBase + ", size of large base: " + largeBase
                + ", area: " + calculateArea());
    }
}
