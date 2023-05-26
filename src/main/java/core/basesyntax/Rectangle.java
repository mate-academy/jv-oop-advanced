package core.basesyntax;

public class Rectangle extends Figure {
    private final int length;
    private final int height;

    public Rectangle(int length, int height, String color) {
        super(color);
        this.length = length;
        this.height = height;
    }

    @Override
    public double getArea() {
        return length * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                +
                getArea() + " sq.units, width: "
                +
                length + " units, height: "
                +
                height + " units, color: "
                +
                getColor());
    }
}
