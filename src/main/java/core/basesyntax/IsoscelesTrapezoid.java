package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double topSide;
    private final double botSide;
    private final double lrSide;

    public IsoscelesTrapezoid(double topSide, double botSide, double lrSide, Color color) {
        super(color);
        this.topSide = topSide;
        this.botSide = botSide;
        this.lrSide = lrSide;
    }

    @Override
    public double calculateArea() {
        return ((topSide + botSide) / 2) * Math.sqrt(lrSide * lrSide
                - Math.pow((botSide - topSide), 2) / 4);
    }

    @Override
    public void drawFigure() {
        System.out.printf("Figure: trapezoid, area %f sq. units, %s, color %s\n",
                calculateArea(), uniqueProperty(), color);
    }

    public String uniqueProperty() {
        return String.format("Bottom side length: %f units, "
                        + "Top side length: %f units, Left and Right side length: %f units",
                botSide, topSide, lrSide);
    }
}
