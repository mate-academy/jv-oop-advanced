package core.basesyntax;

public enum Color {
    RED,
    GRAY,
    BLACK,
    WHITE,
    PINK,
    GREEN,
    BLUE;

    private static Color[] colors = Color.values();
    public static Color getByIndex(int index) {
        return colors[index];
    }
}
