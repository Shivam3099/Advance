package MarksheetJDBC;

import java.util.Iterator;
import java.util.List;

public class TestMarksheetModel {
	public static void main(String[] args) throws Exception {
		//Testadd();
		//testUpdate();
		//testDelete();
		//testMaritlist();
		testSearch();
		//testget();
	}

	public static void Testadd() throws Exception {
		
		MarksheetBean bean  =  new MarksheetBean();
		bean.setId(16);
		bean.setRollno("rays116");
		bean.setfName("priyesh");
		bean.setlName("gupta");
		bean.setPhy(88);
		bean.setCham(85);
		bean.setMaths(87);
		
		MarksheetModel model = new MarksheetModel();
		model.add(bean);
	}
	
	public static void testUpdate() throws Exception {
		MarksheetBean bean  =  new MarksheetBean();
		bean.setId(1);
		
		bean.setlName("karma");
		MarksheetModel model = new MarksheetModel();
		model.update(bean);
	}
public static void testDelete() throws Exception {
		
		MarksheetBean bean  =  new MarksheetBean();
		bean.setId(16);
		
		MarksheetModel model = new MarksheetModel();
		model.Delete(bean);
	}
public static void testMaritlist() throws Exception {
	MarksheetModel model = new MarksheetModel();
	List list =model.getmaritList();
	
	Iterator it = list.iterator();
	
	while (it.hasNext()) {
		MarksheetBean bean = (MarksheetBean) it.next();
	System.out.print("  " + bean.getId());
	System.out.print("  " + bean.getRollno());
	System.out.print("  " + bean.getfName());
	System.out.print("  " + bean.getlName());
	System.out.print("  " + bean.getPhy());
	System.out.print("  " + bean.getCham());
	System.out.println("  " + bean.getMaths());
	}
		 
		System.out.println("ok");
	}

public static void testSearch() throws Exception {
	MarksheetModel model = new MarksheetModel();
	List list =model.search();
	
	Iterator it = list.iterator();
	
	while (it.hasNext()) {
		MarksheetBean bean = (MarksheetBean) it.next();
	System.out.print("\t"+bean.getId());
	System.out.print("\t" + bean.getRollno());
	System.out.print("\t" + bean.getfName());
	System.out.print("\t" + bean.getlName());
	System.out.print("\t" + bean.getPhy());
	System.out.print("\t" + bean.getCham());
	System.out.println("\t"+ bean.getMaths());
	}
		 if(list != null);
		System.out.println("ok");
	}
public static void testget() throws Exception {
	MarksheetModel model = new MarksheetModel();
	List list =model.get("rays105");
	
	Iterator it = list.iterator();
	
	while (it.hasNext()) {
		MarksheetBean bean = (MarksheetBean) it.next();
	System.out.print(" " + bean.getId());
	System.out.print(" " + bean.getRollno());
	System.out.print(" " + bean.getfName());
	System.out.print(" " + bean.getlName());
	System.out.print(" " + bean.getPhy());
	System.out.print(" " + bean.getCham());
	System.out.print(" " + bean.getMaths());
	}
}
}