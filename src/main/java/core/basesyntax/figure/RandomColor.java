package core.basesyntax.figure;

public enum RandomColor {
    WHITE("white"),
    GREEN("green"),
    RED("red"),
    BLUE("blue"),
    YELLOW("yellow");

    private String color;

    RandomColor(String color) {
        this.color = color;
    }

    public String getRandomColor() {
        return color;
    }
}
