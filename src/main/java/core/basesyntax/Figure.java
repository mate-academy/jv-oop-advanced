package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculation {
    public static final int MAX_SIDE = 100;
    protected String color;
    protected final static String START_MASSAGE = "Figure: ";

    protected Figure(String color) {
        this.color = color;
    }
}
