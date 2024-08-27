package core.basesyntax;

public abstract class Figure implements FigureInformation, FigureArea {
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private String color = colorSupplier.getRandomColor();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
