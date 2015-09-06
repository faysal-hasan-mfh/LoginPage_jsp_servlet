package mfh.db;



public class Validity extends DBFacility {


	public static void main(String[] args) {
		
		Validity ob=new Validity();
		
		ob.connectionDB();
		ob.valid("Monir", "1234");
		ob.closeConn();
		
	}

	


}
