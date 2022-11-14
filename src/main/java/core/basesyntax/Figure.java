package core.basesyntax;

public abstract class Figure implements Drawable, FigureArea {
    private String color;

    public Figure(){
    }

    public Figure(String color) {
        this.color = color;
    }

    public static void getRandom() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
