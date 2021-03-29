package core.basesyntax.figures;

import core.basesyntax.state.Figure;

public class IsoscelesTrapezoid extends Figure {
    private int baseA;
    private int baseB;
    private int height;

    public IsoscelesTrapezoid(String name) {
        super(name);
        baseA = (int)((Math.random() * 10) + 1);
        baseB = (int)((Math.random() * 10) + 1);
        height = (int)((Math.random() * 10) + 1);
    }

    @Override
    public double getArea() {
        return (baseA + baseB) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq. cm, first base: %d cm, "
                + "second base: %d cm, height: %d cm, color: %s\n",
                getName(), getArea(), baseA, baseB, height, getColor());
    }
}
