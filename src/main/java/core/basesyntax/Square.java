package core.basesyntax;

public class Square extends Figure implements Drawable {

    private final double side;

    public Square(double side, Color color) {
        this.side = side;
        this.color = color;
        this.area = Math.pow(side,2);
    }

    public void draw() {
        System.out.println(new StringBuilder("Square: area: ")
                .append(area)
                .append(", color: ")
                .append(color)
                .append(", side: ")
                .append(side));
    }
}
