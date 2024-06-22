package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + String.format("%.2f", getArea())
                + " sq. cm, wight: " + String.format("%.2f", width) + " sq. cm, length: "
                + String.format("%.2f", length) + " cm, color: " + color);
    }
}
