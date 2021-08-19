package core.basesyntax;

public abstract class Figure implements AreaOfTheFigures, Displayable {
    private String name;
    private String color;

    public Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
