package core.basesyntax.model;

public enum Colors {
    BLUE("blue"),
    RED("red"),
    GREEN("green"),
    BLACK("black"),
    WHITE("white");

    private String color;

    Colors(String color) {
        this.color = color;
    }

    public String getColors() {
        return this.color;
    }
}
