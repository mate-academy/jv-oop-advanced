package core.basesyntax;

abstract class Figure implements Drawable, Calculable {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}


