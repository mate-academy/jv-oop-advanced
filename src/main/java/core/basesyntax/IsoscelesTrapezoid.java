package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private final int upperSide;
    private final int downSide;
    private final int height;

    public IsoscelesTrapezoid(String color, int upperSide, int downSide, int height) {
        super(color);
        this.upperSide = upperSide;
        this.downSide = downSide;
        this.height = height;
    }

    @Override
    public double getArea() {

        return (double) (upperSide + downSide) / 2 * height;


    }


    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + ", height: " + height + ", upperSide: " + upperSide + ", downSide: " + downSide + ", color: " + getColor());

    }
}