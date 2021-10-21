package core.basesyntax;

public abstract class Figure implements FiguresInformation, AreaCalculator {
    protected String color;

    public void setColor(String color) {
        this.color = color;
    }
}
