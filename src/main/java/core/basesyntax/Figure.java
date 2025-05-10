package core.basesyntax;

public abstract class Figure implements AreaCalculator, PrintInfo {
    private Colors color;

    public Figure(Colors color) {
        this.color = color;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }
}
