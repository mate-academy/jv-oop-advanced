package core.basesyntax;

public class ColorSupplier {
    private String color;

    public String getRandomColor() {

        int randomColorNumber = (int) Math.random() * 3;

        switch (randomColorNumber) {
            case 0: {
                color = "Red";
            }
            break;
            case 1: {
                color = "Green";
            }
            break;
            case 2: {
                color = "Blue";
            }
            break;
            default: {
                System.out.println("The color isn`t available");
            }
        }

        return color;
    }
}
