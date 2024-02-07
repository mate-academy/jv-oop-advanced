package core.basesyntax.service;

public enum Color {
    RED, GREEN, BLUE, YELLOW, PURPLE, ORANGE;

    public static Color getRandomColor() {
        return values()[(int) (Math.random() * values().length)];
    }
}
