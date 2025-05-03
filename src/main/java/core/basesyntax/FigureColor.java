package core.basesyntax;

public enum FigureColor {
    RED("Red"), BLUE("Blue"), GREEN("Green"),
    YELLOW("Yellow"), BLACK("Black"), WHITE("White");

    private final String colorName;

    FigureColor(String colorName) {
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }
}
