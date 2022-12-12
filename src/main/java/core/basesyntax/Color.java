package core.basesyntax;

public enum Color {
    BLACK("Black"),
    BLUE("Blue"),
    GREEN("Green"),
    PURPLE("Purple"),
    RED("Red"),
    WHITE("White"),
    YELLOW("Yellow");

    private final String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
