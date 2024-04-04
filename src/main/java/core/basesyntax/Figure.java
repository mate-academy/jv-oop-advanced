package core.basesyntax;

public class Figure implements Obtainable, Drawable{
    private Color color;
    private String name;

    public Figure(Color color, String name) {
        this.color = color;
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    @Override
    public void draw() {

    }

    @Override
    public double getArea() {
        return 0;
    }
}
