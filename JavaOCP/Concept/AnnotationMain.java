package Concept;

import java.lang.reflect.Field;

public class AnnotationMain {
    public static void main(String[] args) {
        Box b1 = new Box(100, 10);

        try {
            Box.check(b1);

        } catch (IllegalArgumentException e) {
            System.out.println("錯誤的參數");

        } catch (ReflectiveOperationException e) {
            System.out.println("反射錯誤");
        }
    }
}

class Box {
    @AnnotationTest(max = 60, min = 20)
    public int n;
    @AnnotationTest(max = 80, min = 1)
    public int z;

    public Box(int n, int z) {
        this.n = n;
        this.z = z;
    }

    static void check(Box box) throws IllegalArgumentException, ReflectiveOperationException {
        for (Field f : box.getClass().getFields()) {
            AnnotationTest at = f.getAnnotation(AnnotationTest.class);
            if (at != null) {
                Object val = f.get(box);
                if (val instanceof Integer i) {
                    if (i < at.min() || i > at.max()) {
                        throw new IllegalArgumentException(
                                "Invalid arg " + f.getName() + " with value "
                                        + i.toString());
                    }

                }
            }
        }
    }
}
