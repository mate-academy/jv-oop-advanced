package core.basesyntax;

public enum Colors {
    RED("Red"),
    BLUE("Blue"),
    GREEN("Green"),
    BLACK("Black"),
    WHITE("White");

    private String nameOfColor;

    Colors(String nameOfColor) {
        this.nameOfColor = nameOfColor;
    }

    @Override
    public String toString() {
        return nameOfColor;
    }
}
