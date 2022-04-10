package core.basesyntax;

public class ColorSupplier {
    String[] colors = {
            "RED",
            "ORANGE",
            "YELLOW",
            "GREEN",
            "BLUE",
            "DARKBLUE",
            "VIOLET"
    };

    public String getRandomColor() {
        int index = Main.random.nextInt(colors.length);
        return colors[index];
    }
}
