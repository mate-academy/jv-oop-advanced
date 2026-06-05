package core.basesyntax;

public abstract class Figure implements Drawable, Area {
    protected int sideX;
    protected int sideY;
    protected String color;

    public Figure(int sideX, String color) {
        this.sideX = sideX;
        this.color = color;
    }

    public Figure(int sideX, int sideY, String color) {
        this.sideX = sideX;
        this.sideY = sideY;
        this.color = color;
    }
}
