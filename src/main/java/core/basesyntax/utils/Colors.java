package core.basesyntax.utils;

public enum Colors {
    RED,
    BLUE,
    WHITE,
    BLACK,
    YELLOW,
    GREEN,
    ORANGE;

    public final String label;

    Colors() {
        this.label = this.name().toLowerCase();
    }
}
