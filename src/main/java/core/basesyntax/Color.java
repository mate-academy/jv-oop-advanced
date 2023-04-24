package core.basesyntax;

public enum Color {
    WHITE("white"),
    BLACK("black"),
    RED("red"),
    ORANGE("orange"),
    YELLOW("yellow"),
    GREEN("green"),
    BLUE("blue"),
    INDIGO("indigo"),
    VIOLET("violet");

    private final String value;
    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
