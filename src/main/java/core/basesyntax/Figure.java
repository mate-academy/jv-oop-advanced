package core.basesyntax;

public abstract class Figure implements Drawable {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public abstract double getArea();

    public String getColor() {
        return color.name();
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void draw() {
        System.out.println(this);
    }
}
