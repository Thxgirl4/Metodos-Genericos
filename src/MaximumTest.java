public class MaximumTest {
    //determinar o maior de tres objetos comparados

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x; //x é o maior inicialmente

        if (y.compareTo(max) > 0) {
            max = y; // y acaba sendo o maior
        }

        if(z.compareTo(max) > 0) {
            max = z; //z se torna o maior agora
        }
        return max; //retorna o maior objeto
    }
    public static void main(String[] args) {
        System.out.printf("Max of %d, %d and %d is %d\n\n", 7, 5, 9, maximum(7, 5, 9));

        System.out.printf("Max of %.1f, %.1f and %.1f is %.1f\n\n", 8.8, 6.6, 2.2, maximum(8.8, 6.6, 2.2));

        System.out.printf("Max of %s, %s and %s is %s\n", "pear", "apple", "orange", maximum("pear", "apple", "orange"));
    }
}