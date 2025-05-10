package core.basesyntax;

public enum Color {
    WHITE, BLACK, RED, GREEN, BLUE, YELLOW;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
