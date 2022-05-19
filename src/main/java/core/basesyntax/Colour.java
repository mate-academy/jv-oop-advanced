package core.basesyntax;

enum Colour {
    BLUE("blue"),
    RED("red"),
    GREEN("green"),
    YELLOW("yellow"),
    MAGENTA("magenta"),
    WHITE("white"),
    BLACK("black");

    private final String getReadable;

    Colour(String colour) {
        this.getReadable = colour;
    }

    public String getReadable() {
        return getReadable;
    }
}
