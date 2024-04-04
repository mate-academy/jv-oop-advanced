package core.basesyntax;

public class ColorSupplier {
    private Colors[] colors = new Colors[]{
            Colors.white,
            Colors.black,
            Colors.yellow,
            Colors.red,
            Colors.green,
            Colors.blue,
            Colors.gray
    };

    public String getRandomColor() {
        int count = (int)(Math.random() * 6);
        return colors[count].name();
    }

    public String getDefaultColor() {
        return Colors.white.name();
    }
}
