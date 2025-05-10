package core.basesyntax.model;

public enum Color {
    BLACK("black"),
    BROWN("brown"),
    GRAY("gray"),
    ORANGE("orange"),
    RED("red"),
    PINK("pink"),
    PURPLE("purple"),
    BLUE("blue"),
    GREEN("green");

    private String code;

    Color(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
