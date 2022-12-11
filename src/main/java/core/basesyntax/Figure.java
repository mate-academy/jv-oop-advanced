package core.basesyntax;

public abstract class Figure implements Area, Drawing {
    private String color;

    public Figure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        this.color = colorSupplier.getRandomColor();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
