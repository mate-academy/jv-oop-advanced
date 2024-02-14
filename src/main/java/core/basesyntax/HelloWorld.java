package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier(colorSupplier);

        FigureArea[] figures = new FigureArea[6];

        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (int i = 0; i < 6; i++) {
            FigureArea figure = figures[i];
            double area = figure.getArea();
            String color = ((ColorsOfFigures) figure).getColor();
            String figureName = figure.getClass().getSimpleName();
            System.out.print("Figure: " + figureName + ", ");
            System.out.print("area: " + area + " sq. units, ");
            ((FigureOutput) figure).getToDraw();
        }
    }
}
