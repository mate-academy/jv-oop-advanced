package core.basesyntax;

public abstract class Figure implements FigureMethods {
    private Colors color;

    public void setColor(Colors color) {
        this.color = color;
    }

    public Colors getColor() {
        return color;
    }

    public abstract double getArea();

    @Override
    public abstract void draw();
}
