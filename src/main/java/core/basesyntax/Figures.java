package core.basesyntax;

public abstract class Figures {
    private String color;

    public String setColor(String color) {
        return this.color = color;
    }

    public String setColor() {
        return color;
    }

    public String getColor() {
        return color;
    }
}
