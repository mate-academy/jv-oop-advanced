package core.basesyntax;

public class Square extends Figure implements FigureInterface {

        public int side;

    public Square(int side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
        public double calculateArea() {
            return side * side;
        }

    @Override
        public void drawInfo() {
        System.out.println("Figure: square, area: " + calculateArea() +
                " sq.units, side: " + side + " units, color: " + color);
    }
}
