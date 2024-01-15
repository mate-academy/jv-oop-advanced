package core.basesyntax;

public abstract class BaseFigure {
    private String color;

    public BaseFigure() {
        setColor(ColorSupplier.getRandomColor());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
