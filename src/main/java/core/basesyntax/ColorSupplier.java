package core.basesyntax;

public class ColorSupplier {
    public String getRandomColor() {
        String[] colors = new String[]{"red", "grey", "white", "black", "yellow", "orange", "blue"};
        int i = Main.rnd(colors.length);
        return colors[i];
    }
}
