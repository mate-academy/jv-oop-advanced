package core.basesyntax;

public enum Color {
    WHITE("White"),
    RED("Red"),
    GREEN("Green"),
    BLACK("Black"),
    YELLOW("Yellow");

    private final String value;

    Color(String value) {
        this.value = value;
    }
}
