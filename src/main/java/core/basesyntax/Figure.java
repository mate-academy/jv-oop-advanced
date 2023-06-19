package core.basesyntax;

public abstract class Figure implements Drawable {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getShape().getDescription().toLowerCase()
                + ", area: " + String.format("%.2f", getArea()) + " sq.units, "
                + getSizeDescription() + ", color: " + getColor().name().toLowerCase());
    }

    public abstract double getArea();

    public abstract Shape getShape();

    public abstract String getSizeDescription();
}
