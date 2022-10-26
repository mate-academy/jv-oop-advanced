package core.basesyntax;

public abstract class Figure implements AreaCalculation, NameDefinition {
    private String name;
    private String color;

    public Figure(String color) {
        this.name = name;
        this.color = color;
    }

    public abstract String getName();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

