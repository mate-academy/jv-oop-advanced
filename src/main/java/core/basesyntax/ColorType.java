package core.basesyntax;

public enum ColorType {
    WHITE,
    RED,
    YELLOW,
    BLACK,
    GREEN;

    public String toLowerCase() {
        return this.name().toLowerCase();
    }
}

