package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figure{"
                + "color='"
                + color
                + '\''
                +
                '}';
    }

    @Override
    public abstract double getArea();

    @Override
    public abstract void canDraw();
}
