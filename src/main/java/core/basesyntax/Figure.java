package core.basesyntax;

public abstract class Figure implements Area, Draw {
    public static final int LENGTH_LIMIT = 250;
    private Color color;

    public Figure() {
    }

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    //public abstract Figure buildFigure();

}
