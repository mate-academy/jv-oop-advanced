package core.basesyntax;

public class Rectangle extends Figure {
    private double length; // Длина
    private double width; // Ширина

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width; // Площадь = длина * ширина
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq. units, length: " + length + " units, width: " + width
                + " units, color: " + color);
    }
}
