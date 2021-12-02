package core.basesyntax;

import java.util.Locale;

public class IsoscelesTrapezoid extends Figure {
    private final int longerBase;
    private final int shorterBase;
    private final int height;

    public IsoscelesTrapezoid(String color, int longerBase, int shorterBase, int height) {
        super(color);
        this.longerBase = longerBase;
        this.shorterBase = shorterBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((longerBase + shorterBase) * height * 0.5);
    }

    @Override
    public void draw() {
        String drawIsoscelesTrapezoid = String.format("Figure: isosceles trapezoid, "
                                        + "area: %.1f sq.units, longerBase: %d units, "
                                        + "shorterBase: %d units, height: %d units, color: %s.",
                                        getArea(), longerBase, shorterBase, height,
                                        getColor().toLowerCase(Locale.ROOT));
        System.out.println(drawIsoscelesTrapezoid);
    }
}
