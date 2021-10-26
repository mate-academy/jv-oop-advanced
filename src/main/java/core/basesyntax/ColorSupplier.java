package core.basesyntax;

public class ColorSupplier {
    public static String getRandomColor() {
        int minColorAmount = 1;
        int maxColorAmount = 5;

        int randomColor = (int) Math.floor(Math.random()
                * (maxColorAmount - minColorAmount + 1) + minColorAmount);

        switch (randomColor) {
            case 1:
                return "red";
            case 2:
                return "green";
            case 3:
                return "blue";
            case 4:
                return "white";
            case 5:
                return "purple";
            default: return "None selected";
        }
    }
}
