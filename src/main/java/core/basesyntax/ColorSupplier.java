package core.basesyntax;

public class ColorSupplier {
    public String generateColor() {
        final String[] colors = new String[]{"red", "blue", "green",
                "white", "yellow", "orange", "purple"};

        return colors[(int) (Math.random() * colors.length)];
    }
}
