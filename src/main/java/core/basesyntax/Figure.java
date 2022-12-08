package core.basesyntax;

public abstract class Figure {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    abstract public double figureArea();
    abstract public void figureInformation();
    abstract public Figure getRandomFigure();


}
