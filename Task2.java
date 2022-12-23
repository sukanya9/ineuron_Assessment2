package assignment2;

public class Task2 {

	String trainerdetails[];
//		public Trainer(String name,String department,String email,int id) {
//			
//			System.out.println("Trainer Details are:"+name+ "," +department +"," +email + "," +id);
//		}
		
		public void add_Trainer1() {
			//Object arr1[]=new Object[3];
			Object arr1[]= {"Mukesh","Testing","mukesh@gmail.com",100};
			
			System.out.println("Trainer1 Details are:"+arr1[0]);
			System.out.println("Trainer1 Details are:"+arr1[1]);
			System.out.println("Trainer1 Details are:"+arr1[2]);
			System.out.println("Trainer1 Details are:"+arr1[3]);
		}
		public void add_Trainer2() {
			Object arr2[]= {"Suresh","WebDevelopement","suresh@gmail.com",101};
			System.out.println("Trainer2 Details are:"+arr2[0]);
			System.out.println("Trainer2 Details are:"+arr2[1]);
			System.out.println("Trainer2 Details are:"+arr2[2]);
			System.out.println("Trainer2 Details are:"+arr2[3]);
			
		}
		public void add_Trainer3() {
			Object arr3[]= {"Hitesh","Devops","hitesh@gmail.com",102};
			System.out.println("Trainer3 Details are:"+arr3[0]);
			System.out.println("Trainer3 Details are:"+arr3[1]);
			System.out.println("Trainer3 Details are:"+arr3[2]);
			System.out.println("Trainer3 Details are:"+arr3[3]);
		}
		
		public static void main(String[] args) {
			
			Task2 t1=new Task2();
			t1.add_Trainer1();

			Task2 t2=new Task2();
			t2.add_Trainer2();
			
			Task2 t3=new Task2();
			t3.add_Trainer3();
			
	}

}
