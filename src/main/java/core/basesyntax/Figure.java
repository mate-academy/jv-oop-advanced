package core.basesyntax;

public abstract class Figure implements Drawable {
    private Color color;
    private String name;

    public Figure(Color color, String name) {
        this.color = color;
        this.name = name;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double area();
}
