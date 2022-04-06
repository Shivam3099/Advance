package Marksheet;

public class TestMarksheetModel {
public static void main(String[] args) throws Exception {
	Testadd();
}

public static void Testadd() throws Exception {
	
	MarkSheetBean bean  =  new MarkSheetBean();
	bean.setId(3);
	bean.setRollno("rays103");
	bean.setfName("Aakash");
	bean.setlName("Gupta");
	bean.setPhy(88);
	bean.setCham(71);
	bean.setMath(88);
	
	MarksheetModel model = new MarksheetModel();
	model.add(bean);
}
}
