package core.basesyntax;

public enum Color {
    WHITE,
    RED,
    GREEN,
    BLUE,
    YELLOW,
    ORANGE,
    PURPLE,
    PINK,
    BLACK;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}

