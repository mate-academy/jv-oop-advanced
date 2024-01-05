package core.basesyntax;

public class Square extends Figure {
    private int size;
    private String className = this.getClass().getSimpleName();

    public Square(int size, String color) {
        super(color);
        this.size = size;
    }

    @Override
    public double getArea() {
        return size * size;
    }

    @Override
    public String drawing() {
        return "Figure: " + className + ", "
                + "area: " + getArea() + " sq. units, "
                + "side: " + size + " units, "
                + "color: " + getColor();
    }
}

