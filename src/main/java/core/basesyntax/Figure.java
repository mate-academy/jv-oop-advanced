package core.basesyntax;

public abstract class Figure implements Area, Draw{
    private final Colors color;

    public Figure(Colors color) {
        this.color = color;
    }

    public Colors getColor() {
        return color;
    }
}
