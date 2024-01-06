package core.basesyntax;

public class Rectangle extends Figure {
    private int size1;
    private int size2;

    public Rectangle(int size1, int size2, String color) {
        super(color);
        this.size1 = size1;
        this.size2 = size2;
    }

    @Override
    public double getArea() {
        return size1 * size2;
    }

    @Override
    public String draw() {
        return "Figure: " + getClass().getSimpleName() + ", "
                + "area: " + getArea() + " sq. units, "
                + "First size " + size1 + " units, "
                + "Second size " + size2 + " units, "
                + "color: " + getColor();
    }
}
