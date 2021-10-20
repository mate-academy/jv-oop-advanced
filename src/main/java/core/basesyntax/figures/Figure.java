package core.basesyntax.figures;

public abstract class Figure {
    private String name;
    private String color;

    public Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract void about();

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
