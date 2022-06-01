package core.basesyntax;

public enum Color {
    WHITE("white"), BLACK("black"), YELLOW("yellow"), GREEN("green"), ORANGE("orange"), RED("red");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
