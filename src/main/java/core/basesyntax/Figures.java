package core.basesyntax;

public abstract class Figures {
    private Colors color;

    public Figures(Colors color) {
        this.color = color;
    }

    public abstract double getArea();

    public Colors getColor() {
        return color;
    }
}
