public class Box<T> {
    private T t;

    public void add(T t){
        this.t = t;
    }
    public T get(){
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.add(new Integer(20));
        stringBox.add(new String("Ola"));

        System.out.printf("Integer Value: %d\n", integerBox.get());
        System.out.printf("String Value: %s\n", stringBox.get());
    }
}
