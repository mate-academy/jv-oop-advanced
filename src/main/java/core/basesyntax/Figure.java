package core.basesyntax;

public abstract class Figure implements Behavior, BrhaviorPrint {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
