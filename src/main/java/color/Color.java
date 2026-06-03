package color;

public enum Color {
    WHITE("white"),
    RED("red"),
    ORANGE("orange"),
    YELLOW("yellow"),
    GREEN("green"),
    BLUE("blue"),
    INDIGO("indigo"),
    VIOLET("violet"),
    BLACK("black");

    private final String value;

    Color(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
