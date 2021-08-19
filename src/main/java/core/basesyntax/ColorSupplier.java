package core.basesyntax;

public class ColorSupplier {
    public String getRandomColor() {
        Figure figure = new Circle();
        String color = "";
        figure.setColor(color);
        int colorNumber = (int) (1 + Math.random() * (6 - 1));
        switch (colorNumber) {
            case 1:
                color = "Red";
                break;
            case 2:
                color = "Green";
                break;
            case 3:
                color = "Blue";
                break;
            case 4:
                color = "Orange";
                break;
            case 5:
                color = "Yellow";
                break;
            default:
                break;
        }
        return color;
    }
}
