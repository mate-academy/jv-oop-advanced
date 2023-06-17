package core.basesyntax;

public abstract class Figure implements Drawable {
    public static final int MAX_SIZE = 100;
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

    @Override
    public void draw() {
        System.out.println("Figure: " + getShape().getDescription().toLowerCase()
                + ", area:" + String.format("%.2f", getArea()) + " sq.units, "
                + getSizeDescription() + ", color: " + color.name().toLowerCase());
    }

    public abstract double getArea();

    public abstract Shape getShape();

    protected abstract String getSizeDescription();
}
