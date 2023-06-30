package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class RightTriangle extends Figure {
    private int rightLeg;
    private int leftLeg;

    public RightTriangle(Color color, int rightLeg, int leftLeg) {
        super(color);
        this.rightLeg = rightLeg;
        this.leftLeg = leftLeg;
    }

    @Override
    public double calculateArea() {
        double area = (double) (rightLeg * leftLeg) / 2;
        return area;
    }

    @Override
    public String draw() {
        return "Figure : right triangle, area: "
                + calculateArea() + " sq.units,"
                + " rightLeg: " + rightLeg + " units,"
                + " leftLeg: " + leftLeg + " units,"
                + " color: " + getColor();
    }
}
