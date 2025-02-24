package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    public int side1;
    public int side2;
    public int height;

    public IsoscelesTrapezoid(int side1, int side2, int height, String color) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }
    @Override
    public double getArea() {
        return (side1 + side2) * height / 2;
    }
    @Override
    public void draw() {
        System.out.println( "Figure: IsoscelesTrapezoid, area: " + getArea() + "sq. units, side1: " + side1 + " side2: " + side2 + " units, height: " + height + " units, color: " + color);
    }
}
