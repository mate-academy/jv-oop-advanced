package core.basesyntax.figures;

//length × width
public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(String name, double length, double width, String color) {
        this.setName(name);
        this.length = length;
        this.width = width;
        this.setColor(color);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + calculateArea() + " sq.units,"
                + " length: " + length + " units,"
                + " width: " + width + " units,"
                + " color: " + getColor());
    }
}
