package core.basesyntax;

public interface Drawing {
    default void draw() {
        System.out.println(this);
    }
}
