package core.basesyntax;

public enum Color {
    RED("Red"),
    YELLOW("Yellow"),
    GREEN("Green"),
    GREY("Grey"),
    BLUE("Blue"),
    WHITE("White"),
    BLACK("Black");

    private final String value;
    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return getValue();
    }
}
