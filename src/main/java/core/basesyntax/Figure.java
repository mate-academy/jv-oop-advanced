package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawer {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public String getColor() {
        return color.toString().toLowerCase();
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
