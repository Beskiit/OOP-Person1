package OOPact;

class Faculty extends Employee{
	private boolean status;
	
	public Faculty() {
		this.status = status;
	}
	
	public void setStatus(String r){
		if(r.toUpperCase().equals("Y")) {
			status = true;
		}else if(r.toUpperCase().equals("N")) {
			status = false;
		}
	}
	
	public boolean isRegular() {
		return status;
	}
}