package core.basesyntax;

public enum Color {
    WHITE("White"),
    GREEN("Green"),
    PINK("Pink"),
    BLACK("Black"),
    BLUE("Blue"),
    RED("Red");

    private final String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
