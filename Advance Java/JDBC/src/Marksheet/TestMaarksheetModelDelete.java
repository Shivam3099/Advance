package Marksheet;

public class TestMaarksheetModelDelete {
	public static void main(String[] args) throws Exception {
		TestDelete();
	}

	public static void TestDelete() throws Exception {
		
		MarkSheetBean bean  =  new MarkSheetBean();
		bean.setId(3);
		
		MarksheetModelDelete model = new MarksheetModelDelete();
		model.Delete(bean);
	}
}

