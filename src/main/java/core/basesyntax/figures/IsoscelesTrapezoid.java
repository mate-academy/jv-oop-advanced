package core.basesyntax.figures;

import core.basesyntax.Color;

public class IsoscelesTrapezoid extends Figure {
    private final double topSide;
    private final double bottomSide;
    private final double lateralSide;

    public IsoscelesTrapezoid(Color color, double topSide, double bottomSide, double lateralSide) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.lateralSide = lateralSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid{"
                + "color=" + color
                + ", topSide=" + topSide
                + ", bottomSide=" + bottomSide
                + ", lateralSide=" + lateralSide
                + ", area=" + getArea()
                + '}');
    }

    @Override
    public double getArea() {
        double halfPerimeter = (topSide + bottomSide + 2 * lateralSide) / 2.0;
        return Math.sqrt(
                (halfPerimeter - topSide)
                        * (halfPerimeter - bottomSide)
                        * Math.pow((halfPerimeter - lateralSide), 2)
        );
    }
}
