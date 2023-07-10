package core.basesyntax.figure;

import core.basesyntax.tools.Color;

public class IsoscelesTrapezoid extends Figure {
    private int leftSide;
    private int rightSide;

    public IsoscelesTrapezoid(String name, Color color, int leftSide, int rightSide) {
        super(name, color);
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }

    @Override
    public double resultArea() {
        return 0.5 * leftSide * Math.sqrt(rightSide * rightSide - leftSide * leftSide / 4);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(" area: " + resultArea() + " sq.units"
                + ", base: " + leftSide + " units, "
                + "side: " + rightSide + " units, "
                + "color: " + getColor().name());
    }
}
