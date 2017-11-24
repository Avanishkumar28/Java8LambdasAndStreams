package av.i18n;

import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class LocalTest {

	public static void main(String[] args) {
		Locale locale = new Locale("hi", "IN");
		ResourceBundle resourceBundle = ResourceBundle.getBundle("resources.Hello", locale);
		System.out.println("Resource Loaded");
		resourceBundle.keySet()
					  .stream()
					  .forEach(e -> System.out.println(e+" -- "+resourceBundle.getString(e)));
		
		Properties properties = new Properties();
		resourceBundle.keySet()
					  .stream()
					  .forEach(k -> properties.put(k, resourceBundle.getString(k)));
		
		properties.values()
				  .stream()
				  .forEach(System.out :: println);

	}

}
