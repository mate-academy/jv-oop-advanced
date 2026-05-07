package core.basesyntax.figures;

public abstract class Figure implements Drawable {
    protected static final String BASIC_PRINT_INFO = "Figure: %s, area: %.1f sq. units, color: %s";
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract double getArea();
}
