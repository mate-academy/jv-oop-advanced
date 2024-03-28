package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculate {
    private String color;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return colorSupplier.getRandomColor();
    }

}
