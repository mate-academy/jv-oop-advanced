package core.basesyntax;

public enum Color {
    RED("Red"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE("Blue"),
    VIOLET("Violet");

    private final String value;

    Color(String value) {
        this.value = value;
    }
}