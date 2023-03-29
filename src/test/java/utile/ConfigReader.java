package utile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    static Properties prop;

    public  static Properties readProperties(String filepath) {

        try {
            FileInputStream fis = new FileInputStream(filepath);
            prop = new Properties();
            prop.load(fis);
            fis.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        return prop;
    }

    public static String getPropertyValue(String key){

        return prop.getProperty(key);
    }
}


//*[@id="dhi-candidates-form-field_TsjfUZiI8q_input"]/div/div/a[2]