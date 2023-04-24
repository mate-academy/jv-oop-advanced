package core.basesyntax;

public enum Color {
    GREEN("green"),
    BLUE("blue"),
    YELLOW("yellow"),
    PINK("pink"),
    GREY("grey");
    private final String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
