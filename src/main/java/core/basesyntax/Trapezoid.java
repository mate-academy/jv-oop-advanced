package core.basesyntax;

public class Trapezoid extends Figure implements FigureDetailer {
    private String name = "trapezoid";
    private int top;
    private int bottom;
    private int height;
    private Color color;

    public Trapezoid(int top, int bottom, int sides, Color color) {
        this.top = top;
        this.bottom = bottom;
        this.height = sides;
        this.color = color;
    }

    @Override
    public int getArea() {
        return ((top + bottom) / 2) * height;
    }

    @Override
    public void getDetails() {
        System.out.println(getColor() + " " + name + " with height " + height + ", parallel sides "
                + bottom + " and " + bottom + " and area of " + getArea());

    }

    @Override
    public Color getColor() {
        return color;
    }
}
