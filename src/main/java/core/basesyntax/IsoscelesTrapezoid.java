package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements State {
    private final double topSide;
    private final double botSide;
    private final double lrSide;
    private String color;

    public IsoscelesTrapezoid(double topSide, double botSide, double lrSide) {
        this.topSide = topSide;
        this.botSide = botSide;
        this.lrSide = lrSide;
        color = BLACK;

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

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public String uniqueProperty() {
        return String.format("Bottom side length: %f units, "
                        + "Top side length: %f units, Left and Right side length: %f units",
                botSide, topSide, lrSide);
    }
}
