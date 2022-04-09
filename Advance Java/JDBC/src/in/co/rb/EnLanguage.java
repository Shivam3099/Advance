package in.co.rb;

import java.util.ResourceBundle;

public class EnLanguage {
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rb.en");
		System.out.println(rb.getString("greeting"));
	}
}
