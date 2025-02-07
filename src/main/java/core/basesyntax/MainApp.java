package core.basesyntax;

public class MainApp {

    FigureSupplier figureSupplier = new FigureSupplier();
    String randomFigure = figureSupplier.getRandomFigure();
    String defaultFigure = figureSupplier.getDefaultFigure();

    public void main(String[] args) {
        String[] figuresArray = new String[3];
        for (int i = 0; i < figuresArray.length-1; i++) {
            figuresArray[i] = randomFigure;
        }
        figuresArray[2] = defaultFigure;
        System.out.println(figuresArray[0]);
        System.out.println(figuresArray[1]);
        System.out.println(figuresArray[2]);
    }
}