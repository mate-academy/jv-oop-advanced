package core.basesyntax;

public enum Color {
    WHITE("white"),
    BLUE("blue"),
    ORANGE("orange"),
    YELLOW("yellow"),
    GREEN("green");

    private final String name;

    Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
