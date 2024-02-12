package core.basesyntax;

abstract class Figure implements AreaCalculable, Drawable {
    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }
}
