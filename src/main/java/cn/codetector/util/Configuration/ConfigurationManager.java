package cn.codetector.util.Configuration;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Codetector on 2016/1/10.
 *
 * @author Codetector
 */
public class ConfigurationManager {
    private static Map<String, Configuration> configs = new HashMap<>();

    public static Configuration getConfiguration(String configName) {
        if (configs.containsKey(configName)) {
            return configs.get(configName);
        }
        configs.put(configName, new Configuration(new File("./config/" + configName)));
        return getConfiguration(configName);
    }

    public static Configuration getConfiguration(File storeLocation) {
        return new Configuration(storeLocation);
    }
}
