package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculator, Draw {
    private double firstLeg;
    private double secondLeg;
    private String color;

    @Override
    public void setParameters(int sideA,int sideB,int height,int firstLeg,
                              int secondLeg,int radius, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public double getArea() {
        return ((firstLeg * secondLeg) / 2);
    }

    @Override
    public String draw() {
        return color;
    }

    @Override
    public String behaviour() {
        return "Figure: right triangle, area: " + getArea() + " sq.units, firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg + " units, color: " + draw();
    }
}
