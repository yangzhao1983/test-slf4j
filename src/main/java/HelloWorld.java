import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by kaiser_zhao on 2019/9/10.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(HelloWorld.class);
        logger.info("Hello World");
    }
}