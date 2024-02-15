import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try(FileInputStream fileInputStream = new FileInputStream("config.properties")){
           properties.load(fileInputStream);
        }catch (Exception _){}
        System.out.println(properties.getProperty("database-name"));
        System.out.println(properties.getProperty("database-pass"));

        properties.setProperty("database-name","chiso");
        try(FileOutputStream fileOutputStream = new FileOutputStream("config.properties")){
            properties.store(fileOutputStream, "updated!");
        }catch(Exception _){}
        System.out.println("update successful!");
    }
}
