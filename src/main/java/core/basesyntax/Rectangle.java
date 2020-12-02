package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int length;
    private double diagonal;

    public Rectangle(Colour colour, int width, int length) {
        super(colour);
        this.width = width;
        this.length = length;
        this.diagonal = Math.sqrt((width * width) + (length * length));
        this.perimeter = 2 * (width + length);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + calculateArea() + " sq.units, width: "
                + getWidth() + ", length: " + getLength() + ", perimeter: " + getPerimeter()
                + ", diagonal: " + diagonal + ", colour: " + getColour());
    }
}

