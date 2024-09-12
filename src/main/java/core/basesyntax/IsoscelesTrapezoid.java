package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private double lengthUpperBase;
    private double lengthLowerBase;
    private double height;

    public IsoscelesTrapezoid(String color,
                              double lengthUpperBase,
                              double lengthLowerBase,
                              double height) {
        super(color);
        this.lengthUpperBase = lengthUpperBase;
        this.lengthLowerBase = lengthLowerBase;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, lengthOfTheUpperBase: " + lengthUpperBase + " units,"
                + "lengthOfTheLowerBase: " + lengthLowerBase + " units,"
                + "height: " + height + " units,"
                + " color: " + getColor());
    }

    @Override
    public double getArea() {
        return ((lengthUpperBase + lengthLowerBase) * height) / 2;
    }
}
