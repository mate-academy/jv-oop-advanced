package core.basesyntax;

abstract class Figure implements Drawable, HasArea {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }
}
