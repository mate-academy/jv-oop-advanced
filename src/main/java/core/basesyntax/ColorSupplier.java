package core.basesyntax;

public class ColorSupplier {
    private String[] colors = {
            "RED",
            "ORANGE",
            "YELLOW",
            "GREEN",
            "BLUE",
            "DARKBLUE",
            "VIOLET"
    };

    public String[] getColors() {
        return colors;
    }

    public String getRandomColor() {
        int index = Main.getRandom().nextInt(colors.length);
        return colors[index];
    }
}
