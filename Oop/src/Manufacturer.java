class Manufacturer {
	private int manufacID;
	private String manufacName;
	Manufacturer(){
		this.manufacID=0;
		this.manufacName=null;
	}
	Manufacturer(int manufacID,String manufacName){
		this.manufacID=manufacID;
		this.manufacName=manufacName;
	}
	public int getManufacID() {
		return manufacID;
	}
	public void setManufacID(int manufacID) {
		this.manufacID = manufacID;
	}
	public String getManufacName() {
		return manufacName;
	}
	public void setManufacName(String manufacName) {
		this.manufacName = manufacName;
	}
}
