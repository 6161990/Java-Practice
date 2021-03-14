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
	     // studentKim.studentName = "Jenny";----- �ʿ����. �ʼ� �޼ҵ�� �����س��ұ⶧��.
	      studentKim.address = "�ѳ���";
	      
	      studentKim.showStudentInfo();
	      
	      
	      Student studentBlack = new Student(100,"����ũ","������"); 
	   //studentBlack.studentName = "����ũ";----- �ʿ����. �ʼ� �޼ҵ�� �����س��ұ⶧��.
	   //studentBlack.address = "������";----- �ʿ����. �ʼ� �޼ҵ�� �����س��ұ⶧��.
	      
	     studentBlack.showStudentInfo();
	      
	  }
	}