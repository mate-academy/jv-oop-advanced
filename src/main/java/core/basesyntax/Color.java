package core.basesyntax;

public enum Color {
    GREEN("Green"),
    YELLOW("Yellow"),
    BLUE("Blue"),
    PURPLE("Purple"),
    RED("Red"),
    BLACK("Black"),
    WHITE("White");

    private final String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
