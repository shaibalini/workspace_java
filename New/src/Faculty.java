class Faculty {
private int fid;
private String fname;
private int age;
Faculty(){
	this.age=0;
	this.fid=0;
	this.fname=null;
}
public int getFid() {
	return fid;
}
public void setFid(int fid) {
	this.fid = fid;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
