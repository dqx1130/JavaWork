import java.util.logging.Logger;

public class example01 {
    public static void main(String[] args){
        Logger logger = Logger.getGlobal();
        logger.info("Start process...");
        logger.warning("memory");
        logger.fine("ignore");
        logger.severe("process will be terminated...");
    }
}
