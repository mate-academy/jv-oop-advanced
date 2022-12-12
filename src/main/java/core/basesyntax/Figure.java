package core.basesyntax;

public abstract class Figure implements FigureInformation, FigureArea {
    private Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public String getColor() {
        return color.getValue();
    }
}
