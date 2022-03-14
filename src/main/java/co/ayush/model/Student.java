package co.ayush.model;

public class Student {
	
		private String stname;
		private String stpass;
		
		public Student() {
			
		}

		public String getStname() {
			return stname;
		}

		public void setStname(String stname) {
			this.stname = stname;
		}

		public String getStpass() {
			return stpass;
		}

		public void setStpass(String stpass) {
			this.stpass = stpass;
		}
		
		public String toString() {
			return stname + " " + stpass;
		}
		
		

}
