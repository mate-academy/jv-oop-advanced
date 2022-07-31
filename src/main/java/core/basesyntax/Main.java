package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        //Write how many time would you like show result. Half iterations will be standard methods.
        int iteration = 8;
        Figure[] figures = new Figure[iteration];
        for (int i = 0; i < iteration; i++) {
            figures[i] = i < (iteration / 2) ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            System.out.println(figure.writeText());
        }
    }
}
