package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final int DIVIDER_FOR_AREA = 2;
    private int upperSide;
    private int lowerSide;
    private int height;

    public IsoscelesTrapezoid(String color, int upbothside, int downbothside, int height) {
        super(color);
        this.upperSide = upbothside;
        this.lowerSide = downbothside;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid");
        System.out.println("Color: " + getColor());
        System.out.println("Up both side length: " + upperSide);
        System.out.println("Down both side length: " + lowerSide);
        System.out.println("Height length: " + height);
    }

    @Override
    public double getArea() {
        return (double) ((upperSide + lowerSide) * height) / DIVIDER_FOR_AREA;
    }
}
