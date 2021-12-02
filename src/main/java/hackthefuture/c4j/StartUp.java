package hackthefuture.c4j;

public class StartUp {

    public static void main(String[] args) {
        new StartUp().run();
    }

    private void run() {
        Api test = new Api();
        String testData = String.valueOf(test.test());
        System.out.println(testData);
    }


}
