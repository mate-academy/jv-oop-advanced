package core.basesyntax.figures;

public enum Color {
    RED("red"),
    BLUE("blue"),
    WHITE("white"),
    YELLOW("yellow"),
    GRAY("gray"),
    VIOLET("violet");

    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
