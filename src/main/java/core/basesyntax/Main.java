package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        String[] result = new String[6];
        for (int i = 0; i < result.length; i++) {
            if (i < ((result.length / 2))) {
                result[i] = figureSupplier.getRandomFigure().toString();
                System.out.println(result[i]);
            }
            if (i >= ((result.length / 2))) {
                result[i] = String.valueOf(figureSupplier.getDefaultFigure());
                System.out.println(result[i]);
            }
        }
    }
}
