package core.basesyntax;

public class ColorSupplier {
    public String getRandomColor() {
        String figureColor;
        switch ((int) (Math.random() * 8)) {
            case 0:
                figureColor = "yellow";
                break;
            case 1:
                figureColor = "red";
                break;
            case 2:
                figureColor = "green";
                break;
            case 3:
                figureColor = "blue";
                break;
            case 4:
                figureColor = "cyan";
                break;
            case 5:
                figureColor = "gray";
                break;
            case 6:
                figureColor = "magenta";
                break;
            case 7:
                figureColor = "black";
                break;
            default:
                figureColor = "white";
                break;
        }
        return figureColor;
    }
}
