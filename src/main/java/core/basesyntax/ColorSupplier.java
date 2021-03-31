package core.basesyntax;

public class ColorSupplier {
    public Colors randomColor() {
        int number = (int) (Math.random() * 7 + 1);
        switch (number) {
            case 1: return Colors.Blue;
            case 2: return Colors.Green;
            case 3: return Colors.Indigo;
            case 4: return Colors.Orange;
            case 5: return Colors.Red;
            case 6: return Colors.Violet;
            case 7: return Colors.Yellow;
            default: return null;
        }
    }
}
