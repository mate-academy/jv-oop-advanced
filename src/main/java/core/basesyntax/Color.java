package core.basesyntax;

public enum Color {
    RED("RED"),
    ORANGE("ORANGE"),
    YELLOW("YELLOW"),
    GREEN("GREEN"),
    BLU("BLU"),
    VIOLET("VIOLET"),
    WHITE("WHITE");
    private String nameColor;

    Color(String color) {
        this.nameColor = color;
    }

    public String getColor() {
        return nameColor;
    }
}
