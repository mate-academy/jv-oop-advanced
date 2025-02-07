package core.basesyntax;

public class MainApp {

    FigureSupplier figureSupplier = new FigureSupplier();
    String randomFigure = figureSupplier.getRandomFigure();
    String defaultFigure = figureSupplier.getDefaultFigure();

    public String[] main(String[] args) {
        String[] figuresArray = new String[6];
        for (int i = 0; i < figuresArray.length-1; i++) {
            figuresArray[i] = randomFigure;
        }
        figuresArray[5] = defaultFigure;

        return figuresArray;
    }
    @Override
    public String toString() {
        return (randomFigure + defaultFigure);
    }
}
