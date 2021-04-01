package core.basesyntax;

public class Square extends Figure {
    private int length;

    public Square(int length, Colors colors) {
        super(colors);
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, " + "area: " + getArea() + ", length: " + length + ", color: " + getColor());
    }
}
