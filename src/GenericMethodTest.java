public class GenericMethodTest {
        public static <E> void printArray(E[] inputArray) {
            for( E element : inputArray) {
                System.out.printf("%s", element);
            }

            System.out.println();
        }
        public static void main(String[] args) {
            //create arrays of Integer, Double and Character
            Integer[] inteArray = {5, 6, 7, 8, 9, 10};
            Double[] doubleArray = {5.0, 6.0, 7.0, 8.0, 9.0};
            Character[] charArray = {'V', 'A', 'L', 'E', 'U'};

            System.out.println("Array integerArray contains: ");
            printArray(inteArray); //Integer array

            System.out.println("\nArray doubleArray contains: ");
            printArray(doubleArray); // Double array

            System.out.println("\nArray characterArray contains: ");
            printArray(charArray); //Character array
        }
    }
