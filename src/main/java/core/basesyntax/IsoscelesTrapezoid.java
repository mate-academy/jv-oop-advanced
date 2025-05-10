package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int middleLine;

    public IsoscelesTrapezoid(int height, int middleLine, String color) {
        super(color);
        this.height = height;
        this.middleLine = middleLine;
    }

    @Override
    public void draw() {
    }

    @Override
    public double getArea() {
        return height * middleLine;
    }
}
