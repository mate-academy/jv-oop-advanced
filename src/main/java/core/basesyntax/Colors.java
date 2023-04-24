package core.basesyntax;

public enum Colors {
    RED("red"),
    GREEN("green"),
    BLUE("blue"),
    BLACK("black"),
    WHITE("white"),
    YELLOW("yellow"),
    BROWN("brown"),
    GREY("grey");

    private final String properOutput;
    Colors(String properOutput) {
        this.properOutput = properOutput;
    }

    public String getProperOutput() {
        return properOutput;
    }
}



