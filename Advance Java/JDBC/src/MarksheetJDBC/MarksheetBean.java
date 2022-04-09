package MarksheetJDBC;

public class MarksheetBean {
	private int id ;
	private String rollno;
	private String fName;
	private String lName; 
	private int phy;
	private int cham;
	private int maths;
	public MarksheetBean() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getPhy() {
		return phy;
	}
	public void setPhy(int phy) {
		this.phy = phy;
	}
	public int getCham() {
		return cham;
	}
	public void setCham(int cham) {
		this.cham = cham;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}

	 
	}


