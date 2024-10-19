package core.basesyntax.figure;

import core.basesyntax.figure.enums.Color;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, Color color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public double getHypotenuse() {
        double hypotenuse = Math.sqrt(firstLeg * firstLeg + secondLeg * secondLeg);
        return (double) Math.round(hypotenuse * 100) / 100;
    }

    @Override
    public void draw() {
        double area = (double) (firstLeg * secondLeg) / 2;
        System.out.println("Figure: right triangle, "
                + "area: " + area + " sq. units, "
                + "first leg: " + firstLeg + " units, "
                + "second leg: " + secondLeg + " units, "
                + "hypotenuse: " + getHypotenuse() + " units");
    }
}
