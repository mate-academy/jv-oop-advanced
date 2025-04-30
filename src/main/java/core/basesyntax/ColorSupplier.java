package core.basesyntax;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ColorSupplier {
    private final List<Color> availableColors = Arrays.asList(Color.values());
    private final Random random = new Random();

    public Color getRandomColor() {
        int colorsMaxIndex = availableColors.size();
        int randomIndex = random.nextInt(colorsMaxIndex);
        return availableColors.get(randomIndex);
    }
}
