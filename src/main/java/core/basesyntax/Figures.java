package core.basesyntax;

public abstract class Figures implements Area, Print {
    private final String color;

    public Figures(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
