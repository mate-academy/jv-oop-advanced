package core.basesyntax;

public abstract class Figure implements HasArea, HasPerimeter {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract int area();

    public abstract int perimeter();

    @Override
    public String toString() {
        return "Figure: " + this.getClass().getSimpleName() + ", area: " + area()
                + ", perimeter: " + perimeter();
    }
}
