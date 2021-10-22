package core.basesyntax;

public enum Color {
    WHITE("White"),
    BLACK("Black"),
    YELLOW("Yellow"),
    PURPLE("Purple"),
    BLUE("Blue"),
    ORANGE("Orange");

    private final String name;

    private Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
