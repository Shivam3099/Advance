package Marksheet;

public class TextMarkSheetModelUpdate {
	public static void main(String[] args) throws Exception {
		TestUpdate();
	}

	public static void TestUpdate() throws Exception {
		
		MarkSheetBean bean  =  new MarkSheetBean();
		bean.setId(3);
		
		bean.setfName("Dheeraj");
		
		
		MarkSheetModelUpdate model = new MarkSheetModelUpdate();
		model.update(bean);
	}
}
