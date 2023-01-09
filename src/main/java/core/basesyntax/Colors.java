package core.basesyntax;

public enum Colors {
    RED("red"),
    BLUE("blue"),
    GREEN("green"),
    BLACK("black"),
    WHITE("white"),
    YELLOW("yellow");
    private String color;

    Colors(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
