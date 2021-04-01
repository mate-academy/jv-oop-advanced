package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int length;

    public Rectangle(String color, int length, int width) {
        super("rectangle", color);
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        double area = (double) width * length;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea() + " sq. units, width: "
                + width + " units, length: " + length + " units, color: " + color + ".");
    }
}
