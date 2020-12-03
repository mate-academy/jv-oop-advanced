package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private int sides = 0;
    private int bottomBase = 0;
    private int topBase = 0;
    private double height;

    private void setData() {
        while (topBase < 5) {
            this.topBase = new Random().nextInt(50);
        }
        while (bottomBase < topBase) {
            this.bottomBase = new Random().nextInt(100);
        }
        while (sides <= 0 && sides < (bottomBase - topBase) / 2) {
            this.sides = new Random().nextInt(5000);
        }
        this.height = (double) Math.sqrt(Math.pow(sides, 2)
                - (Math.pow(bottomBase - topBase, 2) / 4));
    }

    @Override
    public String getName() {
        return "isoscelesTrapezoid";
    }

    @Override
    public double getArea() {
        setData();
        return (double) (topBase + bottomBase) / 2 * height;
    }

    @Override
    public void printUniqueParameters() {
        System.out.print("perimeter: " + sides * 2 + topBase + bottomBase + " units,");
    }

}
