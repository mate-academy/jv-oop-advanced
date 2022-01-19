package core.basesyntax;

import java.security.SecureRandom;

public class ColorSupplier {
    private SecureRandom secureRandom = new SecureRandom();

    public String getRandomColor() {
        int randomInt = secureRandom.nextInt(10 - 1) + 1;
        switch (randomInt) {
            case 1:
                return "red";
            case 2:
                return "brown";
            case 3:
                return "orange";
            case 4:
                return "green";
            case 5:
                return "blue";
            case 6:
                return "yellow";
            case 7:
                return "gray";
            case 8:
                return "white";
            case 9:
                return "purple";
            case 10:
                return "black";
            default:
                return "yellow";
        }
    }
}
