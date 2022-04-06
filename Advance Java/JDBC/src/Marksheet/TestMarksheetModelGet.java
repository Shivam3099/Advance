package Marksheet;

public class TestMarksheetModelGet {
	public static void main(String[] args) throws Exception {
		Testget();
	}

	public static void Testget() throws Exception {
		
		MarkSheetBean bean  =  new MarkSheetBean();
		bean.setRollno("rays102");
		
		MarksheetModelGet model = new MarksheetModelGet();
		model.get(bean);
	}
}
