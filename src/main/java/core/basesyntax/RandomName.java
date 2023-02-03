package core.basesyntax;

import java.util.Random;

public class RandomName {
    private static Random generateRandomName = new Random();

    public static String getRandomName() {
        int randIndex = generateRandomName.nextInt(NameFigure.values().length);
        return NameFigure.values()[randIndex].name();
    }
}
