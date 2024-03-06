package ch13.sec04;

public class GenericExample {
    public static void main(String[] args) {
        boolean result1 = compare(10,20);
        System.out.println(result1);
        boolean result2 = compare(4.5,4.5);
        System.out.println(result2);
    }
    public static <T extends Number> boolean compare(T t1, T t2){
        double v1 = t1.doubleValue(); //double타입으로 value값
        double v2 = t2.doubleValue();
        return (v1==v2);
    }
}
