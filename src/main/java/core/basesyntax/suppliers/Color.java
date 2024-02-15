package core.basesyntax.suppliers;

public enum Color {
    RED("Red"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE("Blue"),
    PINK("Pink"),
    VIOLET("Violet");

    private final String text;

    Color(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
