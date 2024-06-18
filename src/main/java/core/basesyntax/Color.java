package core.basesyntax;

public enum Color {
    RED,
    ORANGE,
    YELLOW,
    GREEN,
    BLUE,
    PURPLE;
    public String getDisplayName() {
        return switch (this) {
            case RED -> "red";
            case ORANGE -> "orange";
            case YELLOW -> "yellow";
            case GREEN -> "green";
            case BLUE -> "blue";
            case PURPLE -> "purple";
        };
    }
}
