package core.basesyntax;

public abstract class Figure implements AreaCalculator {
    private String colorFigure;

    public Figure(String nameFigure, String colorFigure) {
        this.colorFigure = colorFigure;
    }

    public Figure() {

    }

    public String getColorFigure() {
        return colorFigure;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
