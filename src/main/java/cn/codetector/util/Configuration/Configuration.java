package cn.codetector.util.Configuration;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by codet on 2016/2/10.
 */
public class Configuration {
    private Map<String, Object> configs;
    private File file;

    protected Configuration(File configFile) {
        file = configFile;
        if (!file.exists()) {
            file.mkdirs();
            file.delete();
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String config = null;
        try {
            config = inputStream2String(new FileInputStream(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Load Config
        configs = (HashMap<String, Object>) JSONValue.parse(config);
        if (configs == null) {
            configs = new HashMap<>();
        }
    }

    private static String inputStream2String(InputStream is) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(is));
        StringBuffer buffer = new StringBuffer();
        String line;
        while ((line = in.readLine()) != null) {
            buffer.append(line);
        }
        return buffer.toString();
    }

    public String getStringValue(String key, String defaultValue) {
        if (configs.get(key) == null) {
            setStringValue(key, defaultValue);
            return defaultValue;
        }
        return (String) configs.get(key);
    }

    /**
     * Set the Key Value set to Hashmap
     *
     * @param key   - the Key to set the Value
     * @param Value - The value match the key
     */
    public void setStringValue(String key, String Value) {
        configs.put(key, Value);
        this.save();
    }

    public short getShortValue(String key, short defaultValue) {
        if (configs.get(key) == null) {
            setShortValue(key, defaultValue);
            return defaultValue;
        }
        return Short.parseShort((String) configs.get(key));
    }

    /**
     * Set the Key Value set to Hashmap
     *
     * @param key   - the Key to set the Value
     * @param value - The value match the key
     */
    public void setShortValue(String key, short value) {
        configs.put(key, String.valueOf(value));
        this.save();
    }

    /**
     * Set the Key Value set to Hashmap
     *
     * @param key   - the Key to set the Value
     * @param value - The value match the key
     */
    public void setBooleanValue(String key, boolean value) {
        configs.put(key, String.valueOf(value));
        this.save();
    }

    public boolean getBooleanValue(String key, boolean defaultValue) {
        if (configs.get(key) == null) {
            setBooleanValue(key, defaultValue);
            return getBooleanValue(key, defaultValue);
        }
        return Boolean.parseBoolean((String) configs.get(key));
    }

    public void setIntergerValue(String key, int value) {
        configs.put(key, String.valueOf(value));
        this.save();
    }

    public int getIntergerValue(String key, int defaultValue) {
        if (configs.get(key) == null) {
            setIntergerValue(key, defaultValue);
            return getIntergerValue(key, defaultValue);
        }
        return Integer.parseInt((String) configs.get(key));
    }

    public void setListValue(String key, List<String> list) {
        JSONArray array = new JSONArray();
        for (String str : list) {
            array.add(str);
        }
        configs.put(key, array);
        this.save();
    }

    public List<String> getListValue(String key) {
        if (configs.containsKey(key) && configs.get(key) instanceof List) {
            return (List<String>) configs.get(key);
        }
        return new ArrayList<String>();
    }


    public void save() {
        save(file);
    }

    public void save(File config) {
        try {
            FileWriter fw = new FileWriter(config, false);
            JSONObject object = new JSONObject(configs);
            object.writeJSONString(fw);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
