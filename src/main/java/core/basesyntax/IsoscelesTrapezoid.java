package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double bottomBase;
    private double topBase;

    public IsoscelesTrapezoid(String color, double height,
                              double smallBase, double largeBase) {
        super(color);
        this.height = height;
        this.bottomBase = smallBase;
        this.topBase = largeBase;
    }

    @Override
    public double calculateArea() {
        return ((topBase + bottomBase) / 2) * height;
    }

    @Override
    public void displayProperty() {

    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, color: " + super.getColor()
                + ", height size: " + height + ", small base size: "
                + bottomBase + ", large base size: " + topBase
                + ", area: " + calculateArea());
    }
}
