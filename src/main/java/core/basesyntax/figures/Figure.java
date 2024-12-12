package core.basesyntax.figures;

public abstract class Figure implements AreaCalculable, FigureInfo {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
