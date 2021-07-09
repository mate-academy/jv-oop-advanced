package core.basesyntax;

public class ColorSupplier {
    private int colorNumber;

    public ColorSupplier(int colorNumber) {
        this.colorNumber = colorNumber;
    }

    public String getRandomColor() {
        String color;
        switch (colorNumber) {
            case 0:
                return "Red";
            case 1:
                return "Green";
            case 2:
                return "Blue";
            case 3:
                return "Pink";
            default:
                return "Yellow";
        }
    }
}
