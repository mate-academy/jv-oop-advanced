package core.basesyntax;

public abstract class Figure implements Drawable {
    private final Color color;

    protected Figure(Color color) {
        this.color = color;
    }

    protected Color getColor() {
        return color;
    }

    abstract double getArea();

    @Override
    public String toString() {
        return "Figure: " + getClass().getSimpleName().toLowerCase() + ", "
                + "color: " + color.toString().toLowerCase() + ", "
                + "area: " + getArea() + " sq. units, ";
    }
}
