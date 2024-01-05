package core.basesyntax;

public class Rectangle extends Figure {
    private int size1;
    private int size2;
    private String className = this.getClass().getSimpleName();

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
    public String drawing() {
        return "Figure: " + className + ", "
                + "area: " + getArea() + " sq. units, "
                + "First size " + size1 + " units, "
                + "Second size " + size2 + " units, "
                + "color: " + getColor();
    }
}
