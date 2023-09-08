package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private final Colors colorInColors = Colors.WHITE;
    private String color = colorInColors.name();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
