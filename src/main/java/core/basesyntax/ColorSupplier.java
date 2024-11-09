package core.basesyntax;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ColorSupplier {
    private final List<Color> availableColors = Arrays.asList(Color.values());
    private final Random random = new Random();

    public Color getRandomColor() {
        int randomIndex = random.nextInt(availableColors.size() - 1);
        return availableColors.get(randomIndex);
    }
}
