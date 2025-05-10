package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double bottomSide;
    private double side;

    public IsoscelesTrapezoid(String color, double topSide, double bottomSide, double side) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.side = side;
    }

    public double getArea() {
        double height = Math.sqrt(side * side - Math.pow((bottomSide - topSide) / 2, 2));
        return ((topSide + bottomSide) / 2) * height;
    }

    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, base1: " + topSide
                + ", base2: " + bottomSide
                + ", side: " + side
                + ", color: " + getColor());
    }
}
