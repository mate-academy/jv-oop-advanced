package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private int side = random.nextInt(Max_Value);
    public int getSide() {return side; }
    public void setSide(int side) {this.side = side; }
    @Override
    public double getArea() {
        return side * side;
    }
}

