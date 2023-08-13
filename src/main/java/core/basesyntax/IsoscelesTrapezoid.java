package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topBase;
    private double lowerBase;
    private double height;

    public IsoscelesTrapezoid(String color, double topBase, double downBase, double height) {
        super(color);
        this.topBase = topBase;
        this.lowerBase = downBase;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid  , area : " + getArea()
                + " sq.units , top base : " + topBase
                + " , lower base :" + lowerBase
                + "   units , height : " + height
                + " units , color : " + getColor());
    }

    @Override
    public double getArea() {
        return ((topBase + lowerBase) / 2 * height);
    }
}
