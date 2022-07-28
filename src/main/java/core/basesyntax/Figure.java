package core.basesyntax;

public abstract class Figure implements AreaPrinter, RandomParametersGenerator, AreaCalculator {
    public static final int NUMBER_OF_FIGURES = 5;
    public static final int MAX_VALUE_OF_PARAM = 25;
    private Color color;

    public Figure() {
    }

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public abstract void printArea();

    @Override
    public abstract Figure getRandomParameters();

    @Override
    public abstract double getArea();
}
