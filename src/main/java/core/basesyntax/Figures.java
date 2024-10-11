package core.basesyntax;

public abstract class Figures implements GetArea, GetDraw {
    private String color;

    public Figures(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
