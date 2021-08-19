package core.basesyntax;

public abstract class Figure implements AreaCalculator, InformationDrawer {
    private String color;
    private String figureType;

    public Figure(String color, String figureType) {
        this.color = color;
        this.figureType = figureType;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return figureType;
    }
}
