package core.basesyntax;

public abstract class Figure implements HasArea, HasPerimeter, Drawable {
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

    public abstract int getArea();

    public abstract int getPerimeter();

    public void draw() {
        System.out.print("Figure: " + this.getClass().getSimpleName()
                + ", area: " + getArea()
                + ", perimeter: " + getPerimeter()
                + ", color: " + getColor().toString().toLowerCase());
    }
}
