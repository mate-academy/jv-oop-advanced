package core.basesyntax;

public abstract class Figure implements Drawable {
    protected static final int MAX_SIZE_VARIABLE = 10;
    protected String color;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure() {
        this.color = colorSupplier.getRandomColor();
    }

    public Figure(String color) {
        this.color = color;
    }

    abstract double area();
}
