package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] output = new Figure[6];
        FigureSupplier newFigure = new FigureSupplier();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            output[i] = newFigure.getRandomFigure();
            result.append(output[i].draw());
            result.append("\n");
        }
        for (int c = 3; c < output.length; c++) {
            output[c] = newFigure.getDefaultFigure();
            if (c == 5) {
                result.append(output[c].draw());
                break;
            }
            result.append(output[c].draw());
            result.append("\n");
        }
        System.out.println(result);
    }
}
