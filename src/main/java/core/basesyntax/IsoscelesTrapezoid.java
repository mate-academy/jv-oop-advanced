package core.basesyntax;

public class IsoscelesTrapezoid extends BaseFigure {
    private int firstOppositeSide;
    private int secondOppositeSide;
    private int heightTrapezoid;

    public IsoscelesTrapezoid(int firstOppositeSide, int secondOppositeSide,
                               int heightTrapezoid, Color color) {
        super(color);
        this.firstOppositeSide = firstOppositeSide;
        this.secondOppositeSide = secondOppositeSide;
        this.heightTrapezoid = heightTrapezoid;
    }

    @Override
    public double getArea() {
        return heightTrapezoid * (firstOppositeSide + secondOppositeSide) / 2;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: isosceles trapezoid, area: %.1f sq.units, "
                       + "first opposite side: %d units,"
                       + " second opposite side: "
                       + "%d units, height trapezoid:"
                       + " %d units, color: %s%n",
                getArea(), firstOppositeSide, secondOppositeSide,
                heightTrapezoid, color.toString().toLowerCase());
    }
}
