package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        Figure[] figureArray = new Figure[6];
        FigureSupplier supp = new FigureSupplier();
        for (int i = 0; i < figureArray.length; i++) {
            if (i < 3) {
                figureArray[i] = supp.getRandomFigure();
                figureArray[i].getInfo();
            } else {
                figureArray[i] = supp.getDefaultFigure();
                figureArray[i].getInfo();
            }
        }
    }
}
