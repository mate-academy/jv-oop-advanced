package core.basesyntax;

public enum Color {
    RED("red"),
    BLUE("blue"),
    GREEN("green"),
    YELLOW("yellow"),
    PURPLE("purple"),
    BLACK("black"),
    WHITE("white");

    private String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
