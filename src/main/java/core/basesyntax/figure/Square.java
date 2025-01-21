package core.basesyntax;

public class Square extends Figure {

    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double GetArea() {
        return Math.pow(side, 2);
    }


    @Override
    public void GetPrint() {
        System.out.println("Figura: Kwadrat " + "Pole: " + Math.pow(side, 2) + " Kolor: " + getColor());
    }
}

