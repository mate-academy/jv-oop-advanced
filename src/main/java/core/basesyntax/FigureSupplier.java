package core.basesyntax;

public class FigureSupplier extends ColorSupplier {
    public static final int NUMBER_OF_FIGURES_NAME = 5;

    public FigureSupplier() {

    }

    public String getRandomFigureName() {
        return FigureName.values()[getRandom().nextInt(NUMBER_OF_FIGURES_NAME)].name();
    }

    public Figure getRandomFigure() {
        return new Figure(getRandomColor(), getRandomFigureName());
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10, "circle");
    }
}
