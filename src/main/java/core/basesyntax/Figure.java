package core.basesyntax;

abstract class Figure implements AreaCalculator, Drawable {

    protected static final String AREA_UNITS = " sq. units";
    protected static final String LENGTH_UNITS = " units";

    protected Colors color;

    public Figure(Colors color) {
        this.color = color;
    }

}
