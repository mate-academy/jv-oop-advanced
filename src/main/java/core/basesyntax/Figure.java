package core.basesyntax;

public abstract class Figure implements Squarable, Drawable {
    protected final String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract double getSquare();

    public void DrawFigure() {
        System.out.println(this.toString());
    }
}
