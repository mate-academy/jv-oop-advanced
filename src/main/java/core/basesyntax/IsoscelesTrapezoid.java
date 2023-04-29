package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int middleLine;
    private String color;

    public IsoscelesTrapezoid(int height, int middleLine, String color) {
        this.height = height;
        this.middleLine = middleLine;
        this.color = color;
    }

    @Override
    public void getDraw() {
        super.getDraw();
    }

    @Override
    public double getArea() {
        return height * middleLine;
    }
}
