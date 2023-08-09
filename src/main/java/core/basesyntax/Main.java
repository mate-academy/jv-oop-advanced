package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figuresArray = new Figure[6];
        for (int i = 0; i < figuresArray.length; i++) {
            if (i < figuresArray.length / 2) {
                figuresArray[i] = new FigureSupplier().getRandomFigure();
            } else {
                figuresArray[i] = new FigureSupplier().getDefaultFigure();
            }
        }

        for (Figure figure : figuresArray) {
            System.out.println(figure.getDrawing());
        }
    }
}
