package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.enums.Colors;
import core.basesyntax.enums.Figures;

public class IsoscelesTrapezoid extends Figure {
    private final int firstBase;
    private final int secondBase;
    private final int height;

    public IsoscelesTrapezoid(Colors color, int firstBase, int secondBase, int height) {
        super(Figures.ISOSCELES_TRAPEZOID, color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;

        this.setArea(obtainArea());
    }

    @Override
    public float obtainArea() {
        return ((this.firstBase + this.secondBase) / 2) * this.height;
    }

    @Override
    public void draw() {
        System.out.println(this.getDrawingFirstPart()
                + ", first base: "
                + this.firstBase
                + ", second base: "
                + this.secondBase
                + ", height: "
                + this.height
        );
    }
}
