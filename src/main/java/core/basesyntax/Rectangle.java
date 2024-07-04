package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;
    private double area;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public void getArea() {
        area = length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + area + " sq. units, length: "
                + length + " units, width: "
                + width + " units, color: "
                + getColor());
    }
}
