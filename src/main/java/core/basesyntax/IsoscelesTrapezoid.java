package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int top;
    private int bottom;
    private int height;

    public IsoscelesTrapezoid(String color, int top, int bottom, int height) {
        super(color);
        this.top = top;
        this.bottom = bottom;
        this.height = height;
    }

    @Override
    public void draw() {

    }

    @Override
    public double calculateArea() {
        return 0;
    }
}
