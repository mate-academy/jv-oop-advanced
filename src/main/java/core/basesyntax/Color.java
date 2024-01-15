package core.basesyntax;

public enum Color {
    WHITE("white"),
    BROWN("brown"),
    PINK("pink"),
    BLUE("blue"),
    GREEN("green"),
    BLACK("black"),
    YELLOW("yellow"),
    RED("red"),
    ORANGE("orange");

    private final String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
