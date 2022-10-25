package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String name, double firstLeg, double secondLeg, String color) {
        super(name, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double obtainTheArea() {
        //A = (firstLeg * secondLeg) / 2;
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void toDrawFigure() {
        System.out.println("Figure: " + super.getName().toLowerCase() + ", area: " + obtainTheArea()
                + " sq.units, firstLeg: " + this.firstLeg + " units, secondLeg: " + this.secondLeg
                + " units, color: " + super.getColor().toLowerCase());
    }
}
