package core.basesyntax;

public abstract class Figure implements Drowable {
    private Colors color;

    public void setColor(Colors color) {
        this.color = color;
    }

    public Colors getColor() {
        return color;
    }
}
