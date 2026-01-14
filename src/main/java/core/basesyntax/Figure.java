package core.basesyntax;

public abstract class Figure implements Shape {
    private Colors color;

    public void print() {
        System.out.println();
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public Colors getColor() {
        return color;
    }
}
