package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String name, String color, double side) {
        super(name, color);
        this.side = side;
        super.setArea(side * side);

    }

    @Override
    public void printInfoAboutFigures() {
        super.printInfoAboutFigures();
        System.out.println("side: " + side + " units");
    }
}
