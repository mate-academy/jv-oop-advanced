package core.basesyntax;

import java.security.SecureRandom;

public class FigureSupplier {
    private SecureRandom secureRandom = new SecureRandom();

    public Figure getRandomFigure() {
        int randomInt = secureRandom.nextInt(5 - 1) + 1;
        switch (randomInt) {
            case 1:
                return "red";
            case 2:
                return "brown";
            case 3:
                return "orange";
            case 4:
                return "green";
            case 5:
                return "blue";
    }

    public Figure getDefaultFigure() {
       return new Circle("white", 10);
    }
}
