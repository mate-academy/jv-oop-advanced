package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements State {
    private double topSide = 0;
    private double botSide = 0;
    private double lrSide = 0;
    private String color = RED;

    public IsoscelesTrapezoid(double topSide, double botSide, double lrSide) {
        if (topSide > 0 && botSide > 0 && lrSide > 0) {
            if (topSide < botSide) {
                this.topSide = topSide;
                this.botSide = botSide;
                this.lrSide = lrSide;
            } else {
                System.out.println("Top side should be less than bottom!");
            }
        } else {
            System.out.println("Side cannot be less than 0 or equal 0");
        }
    }

    @Override
    public double countArea() {
        return ((topSide + botSide) / 2) * Math.sqrt(lrSide * lrSide
                - Math.pow((botSide - topSide), 2) / 4);
    }

    @Override
    public void drawFigure() {
        System.out.printf("Figure: square, area %f sq. units, %s, color %s\n",
                countArea(), uniqueProperty(), color);
    }

    public String uniqueProperty() {
        return String.format("Bottom side length: %f units, "
                        + "Top side length: %f units, Left and Right side length: %f units",
                botSide, topSide, lrSide);
    }
}
