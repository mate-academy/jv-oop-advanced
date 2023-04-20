package core.basesyntax;

public abstract class Figure implements AreaCulculator, Draw {
    private Colors color;

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }
}
