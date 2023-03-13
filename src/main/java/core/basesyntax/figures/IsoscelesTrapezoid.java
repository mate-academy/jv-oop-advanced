package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double heigth;
    private double topBase;
    private double bottomBase;

    public IsoscelesTrapezoid(String color, double heigth, double topBase, double bottomBase) {
        super(color);
        this.heigth = heigth;
        this.topBase = topBase;
        this.bottomBase = bottomBase;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getTopBase() {
        return topBase;
    }

    public void setTopBase(double topBase) {
        this.topBase = topBase;
    }

    public double getBottomBase() {
        return bottomBase;
    }

    public void setBottomBase(double bottomBase) {
        this.bottomBase = bottomBase;
    }

    @Override
    public double getArea() {
        return heigth * ((topBase * bottomBase) * 0.5);
    }

    @Override
    public void draw() {
        System.out.println("Figure is: Isosless Trapezoid, " + "area is: "
                + getArea() + " sq.units, "
                + "height is: " + heigth + " units, " + "top base is: " + topBase + " units, "
                + "bottom base is: " + bottomBase + " units, " + "color is: " + getColor());

    }
}
