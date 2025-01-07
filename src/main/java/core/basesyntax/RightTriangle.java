package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg = 0;
    private double secondLeg = 0;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super.setName("RightTriangle");
        super.setColor(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;

    }

    @Override
    public double getArea() {

        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure : " + getName() + ", area : " + getArea()
                + " units, firstLeg : " + firstLeg + " secondLeg : " + secondLeg
                + " units, color : " + getColor());
    }
}
