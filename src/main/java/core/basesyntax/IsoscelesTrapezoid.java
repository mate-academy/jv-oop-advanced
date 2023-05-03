package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double upperSide;
    private final double bottomSide;
    private final double side;

    public IsoscelesTrapezoid(String color, double upperSide, double bottomSide, double side) {
        super(color);
        this.upperSide = upperSide;
        this.bottomSide = bottomSide;
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles trapezoid\nColor: " + getColor()
                + "\nArea: " + getArea() + "\nUpper side: " + upperSide
                + "\nBottom side: " + bottomSide + "\n Side faces: " + side);
    }

    @Override
    public double getArea() {

        double oneLeg = (bottomSide - upperSide) / 2;
        double height = Math.sqrt(Math.pow(side, 2) - Math.pow(oneLeg, 2));
        return ((bottomSide + upperSide) / 2) * height;

    }
}
