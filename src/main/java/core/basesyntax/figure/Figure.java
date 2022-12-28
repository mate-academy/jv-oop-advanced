package core.basesyntax.figure;

public abstract class Figure implements DrawableFigure, GeometricFigure {
    private static final String FIGURE_NAME = "figure";
    protected String color = "blank";

    public static String getName() {
        return FIGURE_NAME;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
