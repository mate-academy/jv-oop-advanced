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
    public double getArea() {
        return height * middleLine;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + " area: " + getArea() + " sq.units, height: " + height
                + " middleline: " + middleLine
                + super.getColor());
    }
}
