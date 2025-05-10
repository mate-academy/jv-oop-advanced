package core.basesyntax.figure;

import java.util.Locale;

public class IsoscelesTrapezoid extends Figure {
    private final double height;
    private final double florLine;
    private final double ceilingLine;

    public IsoscelesTrapezoid(String color, double height, double florLine, double ceilingLine) {
        super(color);
        this.height = height;
        this.florLine = florLine;
        this.ceilingLine = ceilingLine;
    }

    public double getHeight() {
        return height;
    }

    public double getFlorLine() {
        return florLine;
    }

    public double getCeilingLine() {
        return ceilingLine;
    }

    @Override
    public double countArea() {
        return height * ((florLine * ceilingLine) / 2);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + countArea() + " sq.units"
                + ", height " + getHeight() + " florLine " + getFlorLine()
                + " ceilingLine " + getCeilingLine()
                + ", color: " + getColor().toLowerCase(Locale.ROOT));
    }

}
