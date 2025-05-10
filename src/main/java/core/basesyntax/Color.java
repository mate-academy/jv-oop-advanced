package core.basesyntax;

public enum Color {
    WHITE("white"),
    YELLOW("yellow"),
    RED("red"),
    ORANGE("orange"),
    PURPLE("purple"),
    BLUE("blue");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
