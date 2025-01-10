package classes_inheritors;

public abstract class Figure implements Drowable {
    private Color color;

    Figure (Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double calculateArea();
}
