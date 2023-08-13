package core.basesyntax.enums;

public enum Color {
    BLUE("blue"),
    YELLOW("yellow"),
    GREEN("green"),
    WHITE("white"),
    BLACK("black"),
    RED("red");

    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

}
