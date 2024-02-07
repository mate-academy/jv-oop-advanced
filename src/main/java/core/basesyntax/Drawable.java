package core.basesyntax;

public interface Drawable {
    default void drawFigure() {
        System.out.println(this);
    }
}
