package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double bottomSide;
    private double height;

    public IsoscelesTrapezoid(double topSide,
                              double bottomSide,
                              double height,
                              String color) {
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
        this.setColor(color);
    }

    public void draw() {
        System.out.printf("Figure: isoscelesTrapezoid, topSide: "
                + topSide
                + ", bottomSide: "
                + bottomSide
                + ", area: "
                + this.calculateArea()
                + ", color: "
                + getColor().toLowerCase()
                + "\n"
        );
    }

    public double calculateArea() {
        double result = (topSide + bottomSide / 2) * height;
        return Math.ceil(result);
    }
}
