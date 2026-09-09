package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.enums.Figures;

public class IsoscelesTrapezoid extends Figure {
    private final int firstBase;
    private final int secondBase;
    private final int height;

    public IsoscelesTrapezoid(String color, int firstBase, int secondBase, int height) {
        super(Figures.ISOSCELES_TRAPEZOID, color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;

        this.setArea(getArea());
    }

    @Override
    public float getArea() {
        return ((float) (this.firstBase + this.secondBase) / 2) * this.height;
    }

    @Override
    public void draw() {
        System.out.println(this.getDrawingFirstPart()
                + ", first base: "
                + this.firstBase
                + " units, second base: "
                + this.secondBase
                + " units, height: "
                + this.height
                + " units."
        );
    }
}
