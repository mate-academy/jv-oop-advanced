package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator, Draw {
    private double sideA;
    private double sideB;
    private double height;
    private String color;

    @Override
    public void getParameters(int sideA,int sideB,int height,
                              int firstLeg,int secondLeg,int radius, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return ((sideA + sideB) / 2 * height);
    }

    @Override
    public String draw() {
        return color;
    }

    @Override
    public String behaviour() {
        return "Figure: isosceles trapezoid, area: " + getArea() + " sq.units, sideA: " + sideA
                + " units, sideB: " + sideB
                + " units, height: " + height
                + " units, color: " + draw();
    }

}
