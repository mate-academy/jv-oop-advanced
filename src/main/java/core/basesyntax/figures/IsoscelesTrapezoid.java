package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double bottomSide;
    private double height;

    public IsoscelesTrapezoid(double topSide, double bottomSide, double height, String color) {
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
        setColor(color);
    }

    @Override
    public double areaCalc() {
        double area = ((topSide + bottomSide) / 2) * height;
        return getRound(area);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + areaCalc()
                + " sq. units, Top side: " + topSide + " units, "
                + "Bottom side: " + bottomSide + " units, "
                + "Height: " + height + " units, "
                + "color: " + getColor());
    }

}
