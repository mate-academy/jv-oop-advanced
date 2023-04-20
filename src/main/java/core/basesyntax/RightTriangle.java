package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg, secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        super.color = color;
    }

    private double getHypotenuse() {
        return Math.sqrt(Math.pow(firstLeg, 2) + Math.pow(secondLeg, 2));
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Triangle first leg is " + firstLeg + ", triangle second leg is " + secondLeg +
                ", hypotenuse is " + getHypotenuse());
    }
}
