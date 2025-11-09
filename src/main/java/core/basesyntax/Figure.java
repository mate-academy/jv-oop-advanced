package core.basesyntax;

public abstract class Figure implements FigureAreaBehaviour, FigureDrawBehaviour {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color.toLowerCase();
    }
}
