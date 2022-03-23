package core.basesyntax.figure;

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
        System.out.println("Figure: " + getClass().getSimpleName() + ", isosceles trapezoid: "
                + countArea() + " sq. units, color " + getColor()
                + ", height " + getHeight() + " florLine " + getFlorLine()
                + " ceilingLine " + getCeilingLine());
    }

}
