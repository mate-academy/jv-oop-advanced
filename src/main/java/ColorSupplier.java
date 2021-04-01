public class ColorSupplier {
    public static final int MAX_RANDOM_VALUE = 5;
    public static final String COLOR_BLUE = "blue";
    public static final String COLOR_GREEN = "green";
    public static final String COLOR_RED = "red";
    public static final String COLOR_YELLOW = "yellow";
    public static final String COLOR_ORANGE = "orange";
    public static final String COLOR_WHITE = "white";

    public String getRandomColor() {
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
            default:
                return COLOR_WHITE;
        }
        return color;
    }
}
