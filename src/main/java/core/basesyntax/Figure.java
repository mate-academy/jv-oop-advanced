package core.basesyntax;

public abstract class Figure {
    private String color;

    public Figure() {
    }

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color.toLowerCase();
    }
}

