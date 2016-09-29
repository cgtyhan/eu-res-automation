package Utils;

import java.util.Properties;

/**
 * Created by Çağatay Han on 2.09.2016.
 */
public class PropertyReader {
    private static Properties props = null;
    private static PropertyReader instance = null;
    private static Object lock = new Object();


    public static PropertyReader getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new PropertyReader();
                }
            }
        }
        return instance;
    }


    public Properties getProperties(String propFileName){
        props = new Properties();
        try {
            props.load(this.getClass().getClassLoader().getResourceAsStream(propFileName));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return props;
    }
}
