package model;

public class JavaBeans {
	private String productId;
	private String namePro;
	private String vPruduct;
	private String amount;
	private String nameUser;
	private String pass;
	private String uNN;
	private String cPass;
	private String confirmPass;
	
	public JavaBeans() {
		super();
	}
	
	public JavaBeans(String productId, String namePro, String vPruduct, String amount, String nameUser, String pass,
			String uNN, String cPass, String confirmPass) {
		super();
		this.productId = productId;
		this.namePro = namePro;
		this.vPruduct = vPruduct;
		this.amount = amount;
		this.nameUser = nameUser;
		this.pass = pass;
		this.uNN = uNN;
		this.cPass = cPass;
		this.confirmPass = confirmPass;
	}

	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getNamePro() {
		return namePro;
	}
	public void setNamePro(String namePro) {
		this.namePro = namePro;
	}
	public String getvPruduct() {
		return vPruduct;
	}
	public void setvPruduct(String vPruduct) {
		this.vPruduct = vPruduct;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getNameUser() {
		return nameUser;
	}
	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getuNN() {
		return uNN;
	}
	public void setuNN(String uNN) {
		this.uNN = uNN;
	}
	public String getcPass() {
		return cPass;
	}
	public void setcPass(String cPass) {
		this.cPass = cPass;
	}
	public String getConfirmPass() {
		return confirmPass;
	}
	public void setConfirmPass(String confirmPass) {
		this.confirmPass = confirmPass;
	}
	
}