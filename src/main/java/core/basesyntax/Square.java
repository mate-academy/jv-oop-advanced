package core.basesyntax;

public class Square extends Figure {
    public int side;

    public Square(int side, String color) {
        this.side = side;
        setColor(color);
    }

    @Override
    public void area() {
        double areaSquare = Math.pow(side, 2);
        System.out.println("The area of the square is " + areaSquare +
                " and colo " + getColor());
    }
}
