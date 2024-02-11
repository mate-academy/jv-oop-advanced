package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(int length, int width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public double getArea() {
        return (double) length * width;
    }

    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq.units, color: " + getColor());
    }
}
