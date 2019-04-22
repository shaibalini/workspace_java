class Products {
	int productId;
	String productName;
	int productCost;
	
	//default constructor
	Products(){
		this.productId=0;
		this.productName=null;
		this.productCost=0;
	}
	Products(int productId,String productName,int productCost){
		this.productId=productId;
		this.productName=productName;
		this.productCost=productCost;
		
	}
	
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductCost() {
		return productCost;
	}

	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}

	
	
}
