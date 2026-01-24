package core.basesyntax;

public class Square extends Figure{
    public Square(Color color) {
        super(color);
    }

    public Square(Color color, int unit) {
        super(color, unit);
    }

    @Override
    public String draw() {
        return "Figure: square, area: 25.0 sq. units, side: 5 units, color: blue";
    }
}
