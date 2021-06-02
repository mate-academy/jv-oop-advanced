package core.basesyntax;

public class RightTriangle extends Figure implements Area {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        setColor(color);
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: "
                +
                getArea()
                +
                " sq.units, firstLeg: " + firstLeg
                +
                " units, secondLeg "
                +
                secondLeg
                +
                " units, color: "
                +
                getColor());
    }
}
