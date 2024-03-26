package core.basesyntax;

public abstract class Figure implements Drawable {
    protected Color color;

    public Figure() {
        this.color = Color.WHITE;
    }

    public Figure(Color color) {
        this.color = color;
    }

    public abstract double getArea();

    public Color getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getFigureName() + ", area: " + getArea()
                + " sq. units, color: " + getColor());
    }

    protected abstract String getFigureName();
}
