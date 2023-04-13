package core.basesyntax;

public class Rectangle extends Figure {

    private final String color;
    private final double length;
    private final double width;

    public Rectangle(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
  public double getArea() {
        return length * width;
    }

    @Override
  public void draw() {
        System.out.println(
                "Figure : "
                + "rectangle,"
                + " area : "
                + getArea()
                + " sq.units"
                + ", length : "
                + getLength()
                + " units,"
                + " width : "
                + getWidth()
                + " units,"
                + " color : "
                + getColor());
    }
}
