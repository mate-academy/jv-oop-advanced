package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topBase;
    private double bottomBase;
    private double height;
    private double leg;

    public IsoscelesTrapezoid(String color, double topBase, double bottomBase,
                              double height, double leg) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
        this.leg = leg;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {
        System.out.println("IsoscelesTrapezoid: units, area: " + getArea() +
                " sq. units, topBase: " + topBase + " sq. units, bottomBase: "
                + bottomBase + " sq. units, height: " + height +
                " sq. units, leg: " + leg + " units, color: "
                + ColorSupplier.getRandomColor());
    }
}
