package core.basesyntax;

public class ColorSupplier {
    public String getRandomColor() {
        int num = (int) (Math.random() * 6);
        switch (num) {
            case 0:
                return "Black";
            case 1:
                return "White";
            case 2:
                return "Red";
            case 3:
                return "Orange";
            case 4:
                return "Green";
            default:
                return "Blue";
        }
    }
}
