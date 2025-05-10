package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(String color, double sideLength1, double sideLength2) {
        super(color);
        this.width = sideLength1;
        this.height = sideLength2;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double sideLength1) {
        this.width = sideLength1;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double sideLength2) {
        this.height = sideLength2;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + getArea() + " sq.units, width: "
                + getWidth() + " units, height: "
                + getHeight() + " units, color: "
                + getColor());
    }
}
