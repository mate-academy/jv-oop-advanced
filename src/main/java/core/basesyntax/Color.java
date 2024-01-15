package core.basesyntax;

public enum Color {
    WHITE("white"),
    GREY("grey"),
    BLACK("black"),
    PINK("pink"),
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

    public String getValue() {
        return value;
    }
}
