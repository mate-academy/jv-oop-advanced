package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstSide;
    private int secondSide;
    private int hipOfTrapezoid;

    public IsoscelesTrapezoid(String color, int firstSide, int secondSide, int hipOfTrapezoid) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.hipOfTrapezoid = hipOfTrapezoid;
    }

    @Override
    public double getArea() {
        int bigSide = Math.max(firstSide, secondSide);
        int smallSide = Math.min(firstSide,secondSide);
        double firstLeg = (double) (bigSide - smallSide) / 2;
        double height = Math.sqrt(hipOfTrapezoid * hipOfTrapezoid - firstLeg * firstLeg);
        return height * (bigSide + smallSide) / 2;
    }

    @Override
    public void draw() {
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
