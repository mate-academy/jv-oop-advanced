package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    protected String color;

    public Figure(String color) {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {
    }
}
