package core.basesyntax;

public abstract class Figure implements FigureArea {
    private String color;

    public String getColor() {
        return color;
    }

    public String getInfo() {
        return "";
    }
}
