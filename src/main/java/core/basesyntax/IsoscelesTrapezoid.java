package core.basesyntax;

public class IsoscelesTrapezoid extends Figures {
    private int side;
    private int upSide;
    private int downSide;

    public IsoscelesTrapezoid(String color, int side, int upSide, int downSide) {
        super(color);
        this.side = side;
        this.upSide = upSide;
        this.downSide = downSide;
    }

    @Override
    public double area() {
        return side * 2 + upSide + downSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles Trapezoid, area: " + area()
                + " sq. units, side: " + side
                + " sq. units, up: " + upSide
                + " sq. units, up: " + downSide
                + " units, color: " + getColor());
    }
}
