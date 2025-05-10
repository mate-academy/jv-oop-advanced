public class Main {
    public static void main(String[] args) {
        Figure [] figuresArray = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figuresArray.length / 2; i++) {
            figuresArray[i] = figureSupplier.getRandomFigure();
            figuresArray[i].drawFigure();
        }
        for (int i = figuresArray.length / 2; i < figuresArray.length; i++) {
            figuresArray[i] = figureSupplier.getDefaultFigure();
            figuresArray[i].drawFigure();
        }
    }
}
