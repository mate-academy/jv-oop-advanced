package core.basesyntax;

public abstract class Figure implements Properties {
    private Colors color;

    public Figure() {
    }

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
