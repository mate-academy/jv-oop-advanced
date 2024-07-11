package core.basesyntax;

abstract class Figure implements Drawable, GetArea {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFigureData() {
        return getColor();
    }
}
