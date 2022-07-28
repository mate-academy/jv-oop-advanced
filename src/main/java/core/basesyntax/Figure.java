package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculation {
    public static final int MAX_SIDE = 100;
    protected static final String START_MASSAGE = "Figure: ";
    protected String color;

    protected Figure(String color) {
        this.color = color;
    }
}
