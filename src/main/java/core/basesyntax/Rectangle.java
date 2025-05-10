package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int height;

    public Rectangle(String color, int length, int height) {
        super(color);
        this.length = length;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return length * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + calculateArea()
                + " sq. units, length: " + length
                + " units, height: " + height
                + " units, color: " + super.getColor());
    }
}
