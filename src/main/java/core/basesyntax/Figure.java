package core.basesyntax;

public class Figure implements Drawable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figure: " + getClass().getSimpleName()
                + ", color: " + color.toLowerCase()
                + ", ";
    }

    @Override
    public void draw(Figure figure) {
        System.out.println(figure);
    }

    public double getArea() {
        return 0;
    }
}
