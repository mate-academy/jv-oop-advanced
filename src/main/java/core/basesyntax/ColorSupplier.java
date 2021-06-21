package core.basesyntax;

public class ColorSupplier {
    public static String getRandomColor() {
        String color1 = "red";
        String color2 = "green";
        String color3 = "blue";
        String color4 = "white";
        String color5 = "purple";

        int min = 1;
        int max = 5;

        int randomColor = (int) Math.floor(Math.random() * (max - min + 1) + min);

        String randomColorString;

        switch (randomColor) {
            case 1: randomColorString = color1;
            break;
            case 2: randomColorString = color2;
            break;
            case 3: randomColorString = color3;
            break;
            case 4: randomColorString = color4;
            break;
            case 5: randomColorString = color5;
            break;
            default: randomColorString = "None selected";
        }
        return randomColorString;
    }
}
