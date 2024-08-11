package core.basesyntax;

public enum Color {
    BLUE("blue"),
    RED("red"),
    GREEN("green"),
    GINGER("ginger"),
    PURPLE("purple");

    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
