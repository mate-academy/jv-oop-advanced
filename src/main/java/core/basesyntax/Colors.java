package core.basesyntax;

public enum Colors {
    RED("red"),
    BLUE("blue"),
    WHITE("white"),
    GRAY("white"),
    GREEN("green"),
    YELLOW("yellow"),
    PINK("pink"),
    ORANGE("orange"),
    BROWN("brown"),
    PURPLE("purple"),
    GOLD("gold"),
    TEAL("teal"),
    VIOLET("violet"),
    MAGENTA("magenta"),
    CYAN("cyan"),
    CRIMSON("crimson");

    private final String value;

    Colors(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
