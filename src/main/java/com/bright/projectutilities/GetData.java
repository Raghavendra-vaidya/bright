package com.bright.projectutilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetData {

    static String fromProperties(String filePath, String key){
        String data = null;
        Properties prop = new Properties();
        File file = new File(filePath);

        try {
            FileInputStream fis = new FileInputStream(file);
            prop.load(fis);
            data = prop.get(key).toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;

    }


}
