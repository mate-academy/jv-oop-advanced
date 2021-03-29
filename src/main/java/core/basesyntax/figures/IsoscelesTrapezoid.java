package core.basesyntax.figures;

import core.basesyntax.state.ColorSupplier;
import core.basesyntax.state.Figure;

public class IsoscelesTrapezoid extends Figure {
    private int baseA;
    private int baseB;
    private int height;

    public IsoscelesTrapezoid(String name) {
        this.name = name;
        color = ColorSupplier.getRandomColor();
        baseA = (int)((Math.random() * 10) + 1);
        baseB = (int)((Math.random() * 10) + 1);
        height = (int)((Math.random() * 10) + 1);
    }

    @Override
    public double area() {
        return (baseA + baseB) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq. cm, first base: %d cm, second base: %d cm, "
                + "height: %d cm, color: %s\n", name, area(), baseA, baseB, height, color);
    }
}
