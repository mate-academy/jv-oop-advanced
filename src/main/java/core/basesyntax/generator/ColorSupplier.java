package core.basesyntax.generator;

import core.basesyntax.Figure;
import java.util.Random;

public class ColorSupplier {
    public static Figure[] setColors(Figure[] figures) {
        Random random = new Random();

        for (Figure figure: figures) {
            int p = random.nextInt(Generator.getNumberOfColors());
            switch (p) {
                case 0:
                    figure.setColor(Colors.RED.toString());
                    break;
                case 1:
                    figure.setColor(Colors.GREEN.toString());
                    break;
                case 2:
                    figure.setColor(Colors.BLUE.toString());
                    break;
                case 3:
                    figure.setColor(Colors.YELLOW.toString());
                    break;
                case 4:
                    figure.setColor(Colors.PURPLE.toString());
                    break;
                default:
                    break;
            }
        }
        return figures;
    }
}
