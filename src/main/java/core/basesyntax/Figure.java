package core.basesyntax;

public abstract class Figure {
    private String[] unitsName;
    private int[] unitsValues;
    private boolean isSimpleFigure;
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
