package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator, Draw {
    private double sideA;
    private int sideB;
    private String color;

    @Override
    public void setParameters(int sideA,int sideB,int height,int firstLeg,
                              int secondLeg,int radius, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (sideA * sideB);
    }

    @Override
    public String draw() {
        return color;
    }

    @Override
    public String behaviour() {
        return "Figure: rectangle, area: " + getArea() + " sq.units, sideA: " + sideA
                + " units, sideB: " + sideB + " units, color: " + draw();
    }
}
