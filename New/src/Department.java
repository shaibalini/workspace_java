class Department {
private int depID;
private String deptName;
private Faculty f[];
Department()
{
	this.depID=0;
	this.deptName=null;
	this.f=null;
}
public int getDepID() {
	return depID;
}
public void setDepID(int depID) {
	this.depID = depID;
}
public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}
public Faculty[] getF() {
	return f;
}
public void setF(Faculty[] f) {
	this.f = f;
}

}
