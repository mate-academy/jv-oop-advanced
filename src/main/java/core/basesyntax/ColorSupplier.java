package core.basesyntax;

public class ColorSupplier {

    public String generateColor() {
        String[] colors = new String[]{"red", "blue", "green", "white", "yellow", "orange", "purple"};
        return colors[(int) (Math.random() * colors.length)];
    }
}
