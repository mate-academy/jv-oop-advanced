package core.basesyntax;

public interface Drawable {
    default String draw() {
        return this.getClass().getSimpleName();
    }
}
