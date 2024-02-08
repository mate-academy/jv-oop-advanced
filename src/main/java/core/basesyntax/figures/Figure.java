package core.basesyntax.figures;

public abstract class Figure implements AreaCalculator, Drawable {
    //private String name;
    private String colorSupplier;

    public Figure(String color) {
        this.colorSupplier = color;
    }

    public String getColor() {
        return colorSupplier;
    }
}
