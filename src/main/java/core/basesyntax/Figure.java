package core.basesyntax;

public abstract class Figure implements AreaCalculator {
    private Color color;

    public void draw() {
        System.out.println("color: " + color.toString());
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
