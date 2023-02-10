package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {

    protected String color;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure() {
        this.color = colorSupplier.getRandomColor();
    }

    public Figure(String color) {
        this.color = color;
    }
}
