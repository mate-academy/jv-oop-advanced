package core.basesyntax;

public class ColorSupplier {
    public String getRandomColor() {
        String result;
        switch ((int) Math.floor(Math.random() * 10)) {
            case 0: result = "white";
                break;
            case 1: result = "red";
                break;
            case 2: result = "green";
                break;
            case 3: result = "blue";
                break;
            case 4: result = "cyan";
                break;
            case 5: result = "magenta";
                break;
            case 6: result = "yellow";
                break;
            case 7: result = "purple";
                break;
            case 8: result = "gray";
                break;
            case 9: result = "black";
                break;
            default: result = "none";
        }
        return result;
    }
}
