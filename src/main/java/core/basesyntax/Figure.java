package core.basesyntax;

public abstract class Figures implements Drawable, AreaInfo {
    public static final int MAX_SIDE = 100;
    protected String color;

    protected Figures(String color) {
        this.color = color;
    }
}
