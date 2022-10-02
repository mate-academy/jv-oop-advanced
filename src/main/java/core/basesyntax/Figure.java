package core.basesyntax;

public abstract class Figure implements Area, Draw {

    private Color color;

    public Color getColor() {
        this.color = color;
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
