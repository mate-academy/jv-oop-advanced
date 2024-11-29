package core.basesyntax;

public abstract class Shape implements Calculator, Drawable {
    private Colors color;

    public Shape(Colors color) {
        this.color = color;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    @Override
    public abstract double calculateArea();

    @Override
    public abstract void draw();

}
