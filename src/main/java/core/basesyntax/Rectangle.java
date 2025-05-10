package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
     public double getArea() {
        return (double) length * width;
    }

    @Override
     public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, length: "
                + length + " unit, width: " + width + " units, color:" + getColor());
    }
}
