package core.basesyntax;

enum Colour {
    BLUE("blue"),
    RED("red"),
    GREEN("green"),
    YELLOW("yellow"),
    MAGENTA("magenta"),
    WHITE("white"),
    BLACK("black");

    private final String readable;

    Colour(String colour) {
        this.readable = colour;
    }

    public String getReadable() {
        return readable;
    }
}
