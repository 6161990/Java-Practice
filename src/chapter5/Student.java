package chapter5;

public class Student {

	  public int studentID;
	  public String studentName;
	  public String address;
	  
	
	  public Student(String name){
	    studentName = name;
	  }
	  
	  public Student(int id, String name, String address){
	     studentID = id;
	     studentName = name;
	     this.address = address;
	  }
	  
	  public void showStudentInfo(){
	     System.out.println(studentName+ "," +address);
	  }
	  
	  public String getStudentName(){
	      return studentName;
	  }
	  
	  public static void main(String[] args) {
	  
	      Student studentKim = new Student("Jenny"); 
	     // studentKim.studentName = "Jenny";----- 필요없음. 필수 메소드로 구현해놓았기때문.
	      studentKim.address = "한남동";
	      
	      studentKim.showStudentInfo();
	      
	      
	      Student studentBlack = new Student(100,"블랙핑크","합정동"); 
	   //studentBlack.studentName = "블랙핑크";----- 필요없음. 필수 메소드로 구현해놓았기때문.
	   //studentBlack.address = "합정동";----- 필요없음. 필수 메소드로 구현해놓았기때문.
	      
	     studentBlack.showStudentInfo();
	      
	  }
	}