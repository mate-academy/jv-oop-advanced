package core.basesyntax;

public enum Color {
    RED("red"),
    ORANGE("orange"),
    YELLOW("yellow"),
    GREEN("green"),
    BLUE("blue"),
    PURPLE("purple");

    private final String displayName;

    Color(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}
