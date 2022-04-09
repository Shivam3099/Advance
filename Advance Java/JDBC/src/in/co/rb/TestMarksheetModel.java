package in.co.rb;

import MarksheetJDBC.MarksheetBean;
import MarksheetJDBC.MarksheetModel;

public class TestMarksheetModel {
public static void main(String[] args) throws Exception {
	testAdd();
}

public static void testAdd() throws Exception {
	MarksheetBean bean  =  new MarksheetBean();
	bean.setId(118);
	bean.setRollno("rays118");
	bean.setfName("priyesh");
	bean.setlName("gupta");
	bean.setPhy(88);
	bean.setCham(85);
	bean.setMaths(87);
	
	MarksheetModel model = new MarksheetModel();
	model.add(bean);
}
	
}

