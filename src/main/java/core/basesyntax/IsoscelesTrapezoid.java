package core.basesyntax;

public class IsoscelesTrapezoid extends Figure{
    private double height;
    private double shortSide;
    private double longSide;
    public IsoscelesTrapezoid(String color, double height, double longSide, double shortSide) {
        super(color);
        this.height = height;
        this.longSide = longSide;
        this.shortSide = shortSide;
    }

    @Override
    public double getArea() {
        return 0.5 * (longSide + shortSide) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid");
        System.out.println("Area: " + getArea() + " sq. units");
        System.out.println("Height: " + height + " units");
        System.out.println("ShortSide: " + shortSide + " units");
        System.out.println("LongSide: " + longSide + " units");
        System.out.println("Color: " + color);
        System.out.println(" " );
    }
}
