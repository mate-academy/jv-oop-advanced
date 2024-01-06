package core.basesyntax;

public abstract class Figure implements Drawable {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: - , area: - units, sides: - units, color: -");
    }
}
