package core.basesyntax;

public abstract class Figure {
    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public abstract String getUniqueProperties();

    public abstract double calculateArea();

    public final String draw() {    // Declared final to make sure none of children will be able to change style.
        return "Figure: " + this.getClass().getSimpleName() + ", area: " + calculateArea()
                + " sq. units, " + getUniqueProperties() + ", color: " + color;
    }
}
