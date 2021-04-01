package core.basesyntax;

public class ColorSupplier {
    public Color randomColor() {
        int colorNumber = (int) (Math.random() * Color.values().length);
        switch (colorNumber) {
            case 0: return Color.BLUE;
            case 1: return Color.GREEN;
            case 2: return Color.INDIGO;
            case 3: return Color.ORANGE;
            case 4: return Color.RED;
            case 5: return Color.VIOLET;
            case 6: return Color.YELLOW;
            default: return Color.BLUE;
        }
    }
}
