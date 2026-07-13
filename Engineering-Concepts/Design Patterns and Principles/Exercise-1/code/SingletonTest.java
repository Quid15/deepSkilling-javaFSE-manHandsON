public class SingletonTest {
    public static void main(String[] args){
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application started.");
        logger2.log("Processing data");

        if(logger1 == logger2){
            System.out.println("\nSUCCESS: Both logger1 and logger2 hold the same instance.");
        }else{
            System.out.println("\nFAILURE: Instances are different.");
        }
    }
}