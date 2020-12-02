package core.basesyntax;

public interface Drawable {
    default void draw() {
        System.out.println(getClass().getSimpleName() + " is draw");
    }
}
