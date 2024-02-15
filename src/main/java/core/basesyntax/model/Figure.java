package core.basesyntax.model;

public class Figure implements Drawable, FigureArea {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + getClass().getSimpleName()
                + ", color = " + color
                + ", area = " + getArea());
    }

    @Override
    public double getArea() {
        throw new UnsupportedOperationException("Area calculation not implemented for this figure");
    }
}
