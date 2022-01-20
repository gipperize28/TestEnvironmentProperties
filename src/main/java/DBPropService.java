import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class DBPropService {
  private static final String configFile = "qa";

  public static String getPropertyFromFile(String key) {
    String value = System.getProperty(key);
    System.out.println(key + " value read from environment variable = " + value);

    if (value == null || value.isEmpty()) {
      try {
        value = ResourceBundle.getBundle(configFile).getString(key);
        System.out.println(key + " value read from configuration file = " + value);
      } catch (MissingResourceException e) {
        System.out.println(key + " value missing in configuration file " + value);
        value = null;
      }
    }

    return value;
  }

}