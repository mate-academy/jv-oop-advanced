package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private String name = "isoscelesTrapezoid";
    private double bottomBase;
    private double topBase;
    private double side;
    private double height;

    public IsoscelesTrapezoid(double bottomBase, double topBase, double height, Color color) {
        this.bottomBase = bottomBase;
        this.topBase = topBase;
        this.height = height;
        this.color = color;
    }

    private void setData() {
        this.side = (double) Math.sqrt(Math.pow(height, 2)
                + (Math.pow(bottomBase - topBase, 2) / 4));
    }

    public double getPerimeter() {
        setData();
        return side * 2 + topBase + bottomBase;
    }

    @Override
    public double getArea() {
        return (topBase + bottomBase) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Shape: " + name + ", area: " + String.format("%.1f", getArea())
                + " sq. units, perimeter: " + String.format("%.1f", getPerimeter())
                + " units, color: " + color);
    }
}
