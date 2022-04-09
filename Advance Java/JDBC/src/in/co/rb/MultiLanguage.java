package in.co.rb;

import java.util.ResourceBundle;

public class MultiLanguage {
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rb.hi");
		System.out.println(rb.getString("greeting"));
	}
}
