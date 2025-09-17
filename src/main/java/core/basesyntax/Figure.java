package core.basesyntax;
public class Figure implements Drawable {
    private Color color;
    public Figure(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return color;
    }
    public double getArea() {
        return 0;
    };
    public void draw() {};
}
