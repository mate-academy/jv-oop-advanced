package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.enums.Colors;
import core.basesyntax.enums.Figures;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;
    private final float hypotenuse;

    public RightTriangle(Colors color, int firstLeg, int secondLeg) {
        super(Figures.RIGHT_TRIANGLE, color);

        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.hypotenuse = obtainHypotenuse(firstLeg, secondLeg);
        this.setArea(obtainArea());
    }

    private float obtainHypotenuse(int first, int second) {
        return (float) Math.sqrt((first * first) + (second * second));
    }

    @Override
    public float obtainArea() {
        return (float) (this.firstLeg * this.secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println(this.getDrawingFirstPart()
                + ", first leg: "
                + this.firstLeg
                + ", second leg: "
                + this.secondLeg
                + ", hypotenuse: "
                + this.hypotenuse
        );
    }
}
