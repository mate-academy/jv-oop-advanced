package core.basesyntax.enums;

public enum Color {
    WHITE("white"),
    BLACK("black"),
    GREY("grey"),
    RED("red"),
    GREEN("green"),
    YELLOW("yellow"),
    BLUE("blue"),
    ORANGE("orange");

    private String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
