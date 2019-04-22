class Customer{
	private int customerId;
	private String customerName;
	private long contact;
	private String email;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//default constructor
	Customer(){
		this.customerId=0;
		this.customerName=null;
		this.contact=0;
		this.email=null;
	}
	
	//parameterized constructor
	Customer(int customerId,String customerName,int contact,String email){
		this.customerId=customerId;
		this.customerName=customerName;
		this.contact=contact;
		this.email=email;
	}
}