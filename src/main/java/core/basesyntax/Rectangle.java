package core.basesyntax;

public class Rectangle extends Figure implements Area{
    private double length;
    private double width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, length: " + length + " units, width: " + width + " units, color: " + getColor());
    }
}
