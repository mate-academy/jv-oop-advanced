package core.basesyntax.figure.type;

public class Square extends Figure {
    private int length;

    public Square(String color, int length) {
        super(color);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure Square, measure: " + getArea() + ", Color: " + getColor());
    }
}
