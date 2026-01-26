package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final String [] FigureName = {" Square", " Rectangle", " RightTriangle," +
                " Circle", " IsoscelesTrapezoid"};

    public String getRandomFigureName() {
            Random random = new Random();
            int index = random.nextInt(FigureName.length);
            return FigureName[index].toString();
    }
}
