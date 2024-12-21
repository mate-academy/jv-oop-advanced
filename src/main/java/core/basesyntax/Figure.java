package core.basesyntax;

public abstract class Figure implements FigureSquare, FigureInformation {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract String printInformation();
}
