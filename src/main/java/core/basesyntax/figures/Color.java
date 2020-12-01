package core.basesyntax.figures;

import java.util.Random;

public enum Color {
    BLACK("\u001B[30m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    PURPLE("\u001B[35m"),
    CYAN("\u001B[36m"),
    WHITE("\u001B[37m");

    private static Random random = new Random();
    private String code;

    Color(String code) {
        this.code = code;
    }

    public static Color getRandom() {
        switch (random.nextInt(Color.values().length)) {
            case 0:
                return BLACK;

            case 1:
                return RED;

            case 2:
                return GREEN;

            case 3:
                return YELLOW;

            case 4:
                return BLUE;

            case 5:
                return PURPLE;

            case 6:
                return CYAN;

            case 7:
                return WHITE;

            default:
                return BLACK;
        }
    }

    public String getCode() {
        return code;
    }

    public String reset() {
        return "\u001B[0m";
    }
}
