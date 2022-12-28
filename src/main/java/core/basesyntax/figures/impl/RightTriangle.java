package core.basesyntax.figures.impl;

import core.basesyntax.enums.Color;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getSquare() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        String square = String.format("%.1f", getSquare());
        builder.append("Figure: rightTriangle, area: ").append(square).append(" sq.units, ");
        builder.append("firstLeg: ").append(firstLeg).append(" units, ");
        builder.append("secondLeg: ").append(secondLeg).append(" units, ");
        builder.append("color: ").append(getColor());
        System.out.println(builder);
    }
}
