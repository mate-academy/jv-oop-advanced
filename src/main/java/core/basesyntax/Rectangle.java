package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int length;

    public Rectangle(String color, int width, int length) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.println("I am rectangle, my area is " + calculateArea()
                + " my width and length are " + width + " " + length
                + ", my color is " + getColor() + "\n");
    }
}
