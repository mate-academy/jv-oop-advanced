package core.basesyntax;

public class ColorSupplier {
	private String[] colors = {"red", "blue", "white", "black", "pink", "green"};

    public String getRandomColor() {
        return colors[(int)(Math.random() * 5)];
    }
}
