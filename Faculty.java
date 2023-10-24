package OOPactivity;

class Faculty extends Employee{
	private boolean status;
	
	public Faculty() {
		this.status = status;
	}
	
	public void setStatus(String r){
		if(r.toUpperCase() == "Y") {
			status = true;
		}else if(r.toUpperCase() == "N") {
			status = false;
		}
	}
	
	public boolean isRegular() {
		return status;
	}
}
