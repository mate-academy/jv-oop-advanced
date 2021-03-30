package core.basesyntax;

public abstract class Figure implements Behavior, Drawing {
    private String color;
    private String name;

    Figure(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
