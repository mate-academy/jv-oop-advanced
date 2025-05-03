package core.basesyntax;

public interface Drawable {
        void draw();
}

public class Square implements Drawable {
        @Override
        public void draw() {
                System.out.println("Drawing square...");
        }
}
