package core.basesyntax;

public abstract class Figure implements DrawFigure, GetArea {
    private String name;
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}
