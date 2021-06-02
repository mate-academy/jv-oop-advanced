package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Area {
    private double sideLeg;
    private double upperLeg;
    private double lowerLeg;

    public IsoscelesTrapezoid(double sideLeg, double upperLeg, double lowerLeg, String color) {
        this.sideLeg = sideLeg;
        this.upperLeg = upperLeg;
        this.lowerLeg = lowerLeg;
        setColor(color);
    }

    @Override
    public double getArea() {
        return (((upperLeg + lowerLeg) / 2)
                *
                Math.sqrt(sideLeg * sideLeg - ((lowerLeg - upperLeg) * (lowerLeg - upperLeg)) / 4));
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                +
                getArea()
                +
                " sq.units, sideLeg: " + sideLeg
                +
                "units, upperLeg "
                +
                upperLeg
                +
                " units, lowerLeg "
                +
                lowerLeg
                +
                " units, color: "
                +
                getColor());
    }

}
