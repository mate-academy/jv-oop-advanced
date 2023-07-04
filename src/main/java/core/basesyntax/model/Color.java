package core.basesyntax.model;

public enum Color {
    BLACK("black"),
    BLUE("blue"),
    GREEN("green"),
    RED("red"),
    WHITE("white");

    private final String text;
    Color(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
