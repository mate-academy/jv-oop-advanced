package core.basesyntax.utils;

public enum Colors {
    RED,
    BLUE,
    WHITE,
    BLACK,
    YELLOW,
    GREEN,
    ORANGE;

    private final String label;

    Colors() {
        this.label = this.name().toLowerCase();
    }

    public String getLabel() {
        return label;
    }
}
