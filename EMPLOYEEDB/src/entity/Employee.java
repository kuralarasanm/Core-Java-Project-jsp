package entity;

public class Employee {
private int eid;
private String ename;
private String edesignation;
private double esal;
private long eohno;
private int eage;
public Employee(int eid, String ename, String edesignation, double esal, long eohno, int eage) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.edesignation = edesignation;
	this.esal = esal;
	this.eohno = eohno;
	this.eage = eage;
}
public int getEid() {
	return eid;
}
public void setEid(int  eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getEdesignation() {
	return edesignation;
}
public void setEdesignation(String edesignation) {
	this.edesignation = edesignation;
}
public double getEsal() {
	return esal;
}
public void setEsal(double esal) {
	this.esal = esal;
}
public long getEohno() {
	return eohno;
}
public void setEohno(long eohno) {
	this.eohno = eohno;
}
public int getEage() {
	return eage;
}
public void setEage(int eage) {
	this.eage = eage;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", edesignation=" + edesignation + ", esal=" + esal
			+ ", eohno=" + eohno + ", eage=" + eage + "]";
}


}

