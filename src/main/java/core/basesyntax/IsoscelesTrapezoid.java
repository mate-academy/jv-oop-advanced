package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int heightOfTrapezoid;
    private final int upHorizontalSide;
    private final int downHorizontalSide;
    private String color = getColor();

    public IsoscelesTrapezoid(int heightOfTrapezoid, int upHorizontalSide,
                              int downHorizontalSide, String color) {
        this.heightOfTrapezoid = heightOfTrapezoid;
        this.downHorizontalSide = downHorizontalSide;
        this.upHorizontalSide = upHorizontalSide;
        this.color = color;
    }

    @Override
    public double getArea() {
        return ((upHorizontalSide + downHorizontalSide) / 2) * heightOfTrapezoid;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, down horizontal side: " + downHorizontalSide
                + " sq. units, up horizontal side: " + upHorizontalSide
                + " sq. units, height of trapezoid: "
                + heightOfTrapezoid + " units, color: " + color);
    }
}
