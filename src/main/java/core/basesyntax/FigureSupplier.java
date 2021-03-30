package core.basesyntax;

import java.util.Random;

public interface FigureSupplier {
    static String getFigure() {
        Random generator = new Random();
        String[] figureArr = new String[5];
        figureArr[0] = "circle";
        figureArr[1] = "tsoscelesTrapezoid";
        figureArr[2] = "Rectangle";
        figureArr[3] = "RightTriangle";
        figureArr[4] = "Square";

        int randomIndex = generator.nextInt(figureArr.length);
        return figureArr[randomIndex];
    }
}
