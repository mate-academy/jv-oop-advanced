package core.basesyntax;

public abstract class Properties implements AreaObtain, FigureDraw {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private String color = colorSupplier.getRandomColor();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
