package core.basesyntax.figures;

public interface Drawable {

    default void draw() {
        System.out.println("Name: Unknown.");
        System.out.println("Color: Unknown.");
    }
}
