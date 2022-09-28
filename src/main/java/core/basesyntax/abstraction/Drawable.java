package core.basesyntax.abstraction;

public interface Drawable {

    default void draw() {
        System.out.println(this);
    }

}
