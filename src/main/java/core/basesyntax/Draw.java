package core.basesyntax;

public interface Draw {
    default void draw() {
        System.out.println("!!!");
    }
}
