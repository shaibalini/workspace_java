class Bike {
	private int bikeNo;
	private String bikeName;
	private Manufacturer manufac;
	
	public Bike(){
		this.bikeName="";
		this.bikeNo=0;
		this.manufac=null;
	}
	Bike(int bikeNo,String bikeName,Manufacturer manufac){
		this.bikeName=bikeName;
		this.bikeNo=bikeNo;
		this.manufac=manufac;
	}
	
	public int getBikeNo() {
		return bikeNo;
	}
	public void setBikeNo(int bikeNo) {
		this.bikeNo = bikeNo;
	}
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public Manufacturer getManufac() {
		return manufac;
	}
	public void setManufac(Manufacturer manufac) {
		this.manufac=manufac;
	}
	
	
}
