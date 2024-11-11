package core.basesyntax.figure;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private final int bottom;
    private final int up;
    private final int height;

    public IsoscelesTrapezoid(int bottom, int up, int height, Color color) {
        this.color = color;
        this.up = up;
        this.height = height;
        this.bottom = bottom;
    }
    @Override
    public double countArea() {
        return (up + bottom) / 2.0 * height;
    }

    @Override
    public String showInformation() {
        return String.format("Figure: trapezoid, area: %f sq. units, height: %d units, bottom: %d units, up: %d, color: %s", countArea(), height, bottom, up, color.name().toLowerCase());

    }
}
