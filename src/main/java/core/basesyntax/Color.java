package core.basesyntax;

public enum Color {
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

    Color(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
