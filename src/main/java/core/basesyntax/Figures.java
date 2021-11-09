package core.basesyntax;

public class Figures extends BaseLine{

    class RightTriangle implements Forms {
        private final double firstLeg = getRandomSide();
        private final double secondLeg = getRandomSide();
        private final String color =  ColorSupplier.getRandomColor();
        @Override
        public String getColor() {
            return color;
        }

        @Override
        public double getArea() {
            return (getFirstLeg() * getSecondLeg()) / 2;
        }

        @Override
        public void getDraw(){
            System.out.println("Figure "+ "right triangle " + "area: " + getArea()
                    + "sq.units,  firstLeg: " + getFirstLeg() +  ",secondLeg: "+getSecondLeg()+" units," +
                    " color: " + getColor());
        }

        public double getFirstLeg() {
            return firstLeg;
        }

        public double getSecondLeg() {
            return secondLeg;
        }
    }

    public static void main(String[] args) {
       RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.getDraw());
    }
}
