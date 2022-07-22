package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        String[] result = new String[6];
        System.out.println(result[0] = figureSupplier.getRandomFigure().toString());
        System.out.println(result[1] = figureSupplier.getRandomFigure().toString());
        System.out.println(result[2] = figureSupplier.getRandomFigure().toString());
        System.out.println(result[3] = String.valueOf(figureSupplier.getDefaultFigure()));
        System.out.println(result[4] = String.valueOf(figureSupplier.getDefaultFigure()));
        System.out.println(result[5] = String.valueOf(figureSupplier.getDefaultFigure()));
    }
}
