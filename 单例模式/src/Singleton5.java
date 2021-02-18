//登记式/静态内部类
public class Singleton5 {
    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }
    private Singleton5(){}
    public static final Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }
    public void showMessage() {
        System.out.println("Hello World!");
        System.out.println("Singleton5");
    }
}
