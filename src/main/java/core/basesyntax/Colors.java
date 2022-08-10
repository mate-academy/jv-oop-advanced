package core.basesyntax;

public enum Colors {
    BLUE("blue"),
    WHITE("white"),
    RED("red"),
    YELLOW("yellow"),
    GREEN("green"),
    PINK("pink"),
    BLACK("black"),
    ORANGE("orange"),
    GREY("grey"),
    VIOLET("violet");

    private final String title;

    Colors(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

    public String getTitle() {
        return title;
    }
}
