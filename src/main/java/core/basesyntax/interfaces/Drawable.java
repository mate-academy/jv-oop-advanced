package core.basesyntax.interfaces;

public interface Drawable {
    default void draw() {
        System.out.println("We drew a " + this);
    }
}
