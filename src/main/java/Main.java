import shapes.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ListBuilder listBuilder = new ListBuilder();
        ArrayList<Shape> shapes = listBuilder.build();


        for(Shape shape : shapes) {
            shape.draw();
            System.out.println();
        }
    }
}
