package core.basesyntax;

public abstract class Figure implements AreaCalculator, Informable {
    private String color;
    private String name;

    public Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
