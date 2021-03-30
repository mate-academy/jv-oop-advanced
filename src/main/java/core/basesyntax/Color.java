package core.basesyntax;

public enum Color {
    RED("Red"),
    GREEN("Green"),
    BLUE("Blue"),
    WHITE("White"),
    BLACK("Black"),
    YELLOW("Yellow");

    private final String name;

    Color(String color) {
        name = color;
    }

    public String getName() {
        return name;
    }
}
