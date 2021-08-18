package core.basesyntax;

public class ColorSupplier {
    private String[] colors = new String[]{"red", "orange", "yellow", "green", "blue", "white"};

    public String getRandomColor() {
        int random = (int)Math.floor(Math.random() * colors.length);
        return colors[random];
    }
}
