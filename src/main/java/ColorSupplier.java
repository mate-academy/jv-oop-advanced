public class ColorSupplier {
    static final int MAX_RANDOM_VALUE = 5;
    static final String COLOR_BLUE = "blue";
    static final String COLOR_GREEN = "green";
    static final String COLOR_RED = "red";
    static final String COLOR_YELLOW = "yellow";
    static final String COLOR_ORANGE = "orange";
    static final String COLOR_WHITE = "white";

    String getRandomColor() {

        int choice = (int) (1 + (Math.random() * MAX_RANDOM_VALUE));
        String color = "";
        switch (choice) {
            case 1:
                color = COLOR_BLUE;
                break;
            case 2:
                color = COLOR_GREEN;
                break;
            case 3:
                color = COLOR_RED;
                break;
            case 4:
                color = COLOR_YELLOW;
                break;
            case 5:
                color = COLOR_ORANGE;
                break;
            case 6:
                color = COLOR_WHITE;
                break;
            default:
                break;
        }
        return color;
    }
}
