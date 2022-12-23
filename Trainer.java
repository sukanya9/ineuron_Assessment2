package assignment2;

public class Trainer {

		 String tname;
		 String tdept;
		 String temail;
		 int id;
		 
		 //using constructor
//		public Trainer(String name,String department,String email,int id) {
//			
//			System.out.println("Trainer Details are:"+name+ "," +department +"," +email + "," +id);
//		}
		
		 //using method
		public void add_Trainer1(String name,String department,String email,int id) {
			System.out.println("Trainer1 Details are:"+name+ "," +department +"," +email + "," +id);
		}
		public void add_Trainer2(String name,String department,String email,int id) {
			System.out.println("Trainer2 Details are:"+name+ "," +department +"," +email + "," +id);
		}
		public void add_Trainer3(String name,String department,String email,int id) {
			System.out.println("Trainer3 Details are:"+name+ "," +department +"," +email + "," +id);
		}
		
		public static void main(String[] args) {
			Trainer t1=new Trainer();
			t1.add_Trainer1("Mukesh","Testing","mukesh@gmail.com",1);
				
			Trainer t2=new Trainer();
			t2.add_Trainer2("Suresh","WebDevelopement","suresh@gmail.com",2);
				
			Trainer t3=new Trainer();
			t3.add_Trainer3("Hitesh","Devops","hitesh@gmail.com",3);
				
//			Trainer t1=new Trainer("Mukesh","Testing","mukesh@gmail.com",1);
//			Trainer t2=new Trainer("Hitesh","WebDevelopment","hitesh@gmail.com",2);
//			Trainer t3=new Trainer("umesh","Devops","umesh@gmail.com",3);
			
	}

}
