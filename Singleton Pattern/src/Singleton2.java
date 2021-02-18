//懒汉式，线程安全
public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2(){}

    private static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
    public void showMessage() {
        System.out.println("Hello World!");
        System.out.println("Singleton2");
    }
}
