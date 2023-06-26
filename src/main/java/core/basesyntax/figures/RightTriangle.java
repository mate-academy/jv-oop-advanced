package core.basesyntax.figures;

import core.basesyntax.Color;

public class RightTriangle extends Figure {
    private final double baseLeg;
    private final double heightLeg;

    public RightTriangle(Color color, double baseLeg, double heightLeg) {
        super(color);
        this.baseLeg = baseLeg;
        this.heightLeg = heightLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle{"
                + "baseLeg=" + baseLeg
                + ", heightLeg=" + heightLeg
                + ", area=" + getArea()
                + '}');
    }

    @Override
    public double getArea() {
        return 0.5 * baseLeg * heightLeg;
    }
}
