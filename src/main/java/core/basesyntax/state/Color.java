package core.basesyntax.state;

public enum Color {
    BLUE("blue"),
    WHITE("white"),
    BLACK("black"),
    GREEN("green"),
    BROWN("brown"),
    YELLOW("yellow"),
    PURPLE("purple"),
    ORANGE("orange");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getInfo() {
        return color;
    }
}
