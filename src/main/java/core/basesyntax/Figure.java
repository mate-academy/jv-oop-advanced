package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawing {
    private String color;
    private String figuresName;

    public Figure(String color, String figuresName) {
        this.color = color;
        this.figuresName = figuresName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFiguresName() {
        return figuresName;
    }

    public void setFiguresName(String figuresName) {
        this.figuresName = figuresName;
    }
}
