package core.basesyntax;

abstract class Figure implements Area, Drawable {
    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }

}
