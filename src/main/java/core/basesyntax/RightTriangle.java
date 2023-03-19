package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String name, String color, double firstLeg, double secondLeg) {
        super.name = name;
        super.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void printInformation() {
        System.out.println("Figure: " + name + ", area: " + getArea() +
                " sq.units, first leg: " + firstLeg +
                " units, second leg: " +
                secondLeg + " units, color: " + color);
    }
}
