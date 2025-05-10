package core.basesyntax.figure;

public class IsoscelesTrapezoid extends Figure {
    private double topBase;
    private double bottomBase;
    private double height;

    public IsoscelesTrapezoid(String color, double topBase, double bottomBase, double height) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * ((topBase + bottomBase) / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea()
                + " sq. units, top base: "
                + topBase
                + " units,bottom base: "
                + bottomBase
                + " units, height: "
                + height
                + " units, color: "
                + getColor());
    }
}
