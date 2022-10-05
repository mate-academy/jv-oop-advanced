package core.basesyntax.figures;

public interface Drawable {
    default void draw() {
        System.out.println("Unknown type of figure");
    }
}
