package core.basesyntax;

public class Square extends Figure {
    private int size;

    public Square(int size, String color) {
        super(color);
        this.size = size;
    }

    @Override
    public double getArea() {
        return size * size;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", "
                + "area: " + getArea() + " sq. units, "
                + "side: " + size + " units, "
                + "color: " + getColor());
    }
}
