package core.basesyntax;

public class Square implements Figure {
     double side;
     String color;

        public Square(double side, String color){
            this.side = side;
            this.color = color;
        }
        @Override
        public double getArea(){
            return side * side;
        }
        @Override
        public void draw(){
            System.out.println("Drawing a square...");
            System.out.println("Side: " + side);
            System.out.println("Area: " + getArea());
        }

}
