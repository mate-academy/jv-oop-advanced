package core.basesyntax;

public class FigureUnicMetodSwitcher {
    public void unicMetod(Figure figure) {
        switch (figure.getName()) {
            case "Circle":
                System.out.println("Radius: " + figure.getRadius());
                break;
            case "Trapezoid":
                System.out.println("Height: " + figure.getHeight());
                break;
            case "Rectangle":
                System.out.println("Side: " + figure.getSide());
                break;
            case "Right triangle":
                System.out.println("Side: " + figure.getSide());
                break;
            default:
            case "Square":
                System.out.println("Side: " + figure.getSide());
                break;
        }
    }
}
