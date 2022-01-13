package core.basesyntax;

public abstract class Figures implements AreaGetter {
    private String color;

    public String setColor(String color) {
        return this.color = color;
    }

    public String getColor() {
        return color;
    }
}
