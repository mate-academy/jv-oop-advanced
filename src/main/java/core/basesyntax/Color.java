package core.basesyntax;

public enum Color {
    WHITE("white"),
    RED("red"),
    ORANGE("orange"),
    YELLOW("yellow"),
    GREEN("green"),
    BLUE("blue"),
    VIOLET("violet");

    private final String value;

    Color(String value) {
        this.value = value;
    }
}
