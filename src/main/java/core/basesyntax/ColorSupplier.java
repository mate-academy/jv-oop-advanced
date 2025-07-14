package core.basesyntax;

public class ColorSupplier extends Supplier {
    public Color getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index];
    }
}
