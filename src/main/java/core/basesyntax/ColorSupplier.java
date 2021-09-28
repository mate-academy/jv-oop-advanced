package core.basesyntax;

public class ColorSupplier {
    private String[] colors = {"red", "blue", "white", "black", "pink", "green"};
    public String getRandomColor() {
        String[] colors = {"red", "blue", "white", "black", "pink", "green"};
        return colors[(int)(Math.random() * 5)];
    }
}
