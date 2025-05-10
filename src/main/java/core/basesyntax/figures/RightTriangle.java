package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        double area = this.calculateArea();
        String colorLowerCase = this.getColor().name().toLowerCase();
        String information = String.format(
                "Figure: right triangle, area: %.1f sq.units, "
                        + "firstLeg: %d units, secondLeg: %d units, color: %s",
                area, firstLeg, secondLeg, colorLowerCase);
        System.out.println(information);
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg / 2;
    }
}
