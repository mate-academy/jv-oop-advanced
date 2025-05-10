package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private FigureType name;
    private String color;

    public Figure(FigureType name, String color) {
        this.name = name;
        this.color = color;
    }

    public FigureType getName() {
        return name;
    }

    public void setName(FigureType name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
