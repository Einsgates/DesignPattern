//饿汉式，线程安全
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();
    private Singleton3(){}
    public static Singleton3 getInstance() {
        return instance;
    }
    public void showMessage() {
        System.out.println("Hello World!");
        System.out.println("Singleton3");
    }
}
