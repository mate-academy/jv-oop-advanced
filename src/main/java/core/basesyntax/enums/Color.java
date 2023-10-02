package core.basesyntax.enums;

public enum Color {
    BLACK("black"),
    BLUE("blue"),
    GREEN("green"),
    RED("red"),
    WHITE("white"),
    YELLOW("yellow");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
