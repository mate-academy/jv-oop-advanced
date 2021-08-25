package core.basesyntax;

public class ColorSupplier {
    private String color;

    public String getRandomColor() {

        int randomColorNumber = (int) (Math.random() * 3);

        switch (randomColorNumber) {
            case 0: {
                return "Red";
            }
            case 1: {
                return "Green";
            }
            case 2: {
                return "Blue";
            }
            default: {
                return "The color isn`t available";
            }
        }

    }
}
