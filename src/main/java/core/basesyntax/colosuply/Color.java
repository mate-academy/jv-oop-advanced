package core.basesyntax.colosuply;

public enum Color {
    RED,
    ORANGE,
    YELLOW,
    GREEN,
    BLUE,
    INDIGO,
    VIOLET,
    WHITE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
