package core.basesyntax;

public class Square extends Figure implements GetArea {
    private int length;

    public Square(int length, Color colors) {
        super(colors);
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, "
                + "area: "
                + getArea()
                + ", length: "
                + length
                + ", color: "
                + getColor());
    }
}
