package core.basesyntax;

public class Trapezoid extends Figure implements FigureDetailer {
    private FigureE name = FigureE.TRAPEZOID;
    private int top;
    private int bottom;
    private int height;

    public Trapezoid(int top, int bottom, int sides) {
        this.top = top;
        this.bottom = bottom;
        this.height = sides;
    }

    @Override
    public void getArea() {
        System.out.println(((top + bottom) / 2) * height);
    }

    @Override
    public void getDetails() {
        System.out.print(getColor() + " " + name + " with height " + height + ", parallel side "
                + bottom + " and " + bottom + " and area of ");
        getArea();
    }
}
