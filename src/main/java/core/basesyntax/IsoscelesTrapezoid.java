package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator, FigurePainter {
    private final int firstSide;
    private final int secondSide;
    private final int hipOfTrapezoid;

    public IsoscelesTrapezoid(String color, int firstSide, int secondSide, int hipOfTrapezoid) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.hipOfTrapezoid = hipOfTrapezoid;
    }

    @Override
    public double getArea() {
        int bigSide;
        int smallSide;
        if (firstSide == secondSide) {
            return firstSide * secondSide;
        }
        if (firstSide > secondSide) {
            bigSide = firstSide;
            smallSide = secondSide;
        } else {
            bigSide = secondSide;
            smallSide = firstSide;
        }
        double firstLeg = (double) (bigSide - smallSide) / 2;
        double height = Math.sqrt(hipOfTrapezoid * hipOfTrapezoid - firstLeg * firstLeg);
        return height * (bigSide + smallSide) / 2;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + String.format("%.1f", getArea())
                + " sq.units, first side: "
                + firstSide
                + " units, second side: "
                + secondSide
                + " units, hip: "
                + hipOfTrapezoid
                + " units, color: "
                + getColor());
    }
}
