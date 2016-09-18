
/*Assignment – Create student result processing system with an abstract
class.
*/

abstract class ResultProcessingSystem{
	int studentRoll;
	String name;
	int registerationNumber;
	int result;
	//abstract methods
	abstract public int getRoll();
	abstract public String getName();
	abstract public int getRegistrationNum();
	abstract public void getResult();				//abstract result getter
	abstract public void setResult(int result);		//abstract result setter
	
}
class StudentsOf2015 extends ResultProcessingSystem{			//2015
	public StudentsOf2015(int roll, String Name, int regNum) {
		this.studentRoll=roll;
		this.name=Name;
		this.registerationNumber=regNum;
		
	}

	@Override
	public int getRoll() {
		
		return studentRoll;
		
	}

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public int getRegistrationNum() {
		
		return registerationNumber;
	}
	
	@Override
	public void setResult(int result) {
		
              int gradePoint;
        if(result>=80 && result<=100)
          gradePoint=(int) 10;
    else if(result>=75 && result<=79)
          gradePoint=(int) 9;
    else if(result>=70 && result<=74)
          gradePoint=(int) 8;
    else if(result>=65 && result<=69)
          gradePoint=(int) 7;
    else if(result>=60 && result<=64)
          gradePoint=(int) 6;
    else if(result>=55 && result<=59)
          gradePoint=(int) 5;
    else if(result>=50 && result<=54)
          gradePoint=(int) 4;
    else if(result>=45 && result<=49)
          gradePoint=(int) 3;
    else if(result>=40 && result<=44)
          gradePoint=(int) 2;
        else
            gradePoint=(int) 0.00;
   //return gradePoint;
		this.result= gradePoint;
	}
        
        

	@Override
	public void getResult() {
		System.out.println(name+"  Regristeration number " +registerationNumber+" Grades are : " +result+ "");
		System.out.println("");
	}

	  
	
	
}

class StudentsOf2016 extends ResultProcessingSystem{			//2016
	public StudentsOf2016(int roll, String Name, int regNum) {
		this.studentRoll=roll;
		this.name=Name;
		this.registerationNumber=regNum;
		
	}

	@Override
	public int getRoll() {
		
		return studentRoll;
		
	}

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public int getRegistrationNum() {
		
		return registerationNumber;
	}
	
	@Override
	public void setResult(int result) {
		
              int gradePoint;
        if(result>=80 && result<=100)
          gradePoint=(int) 10;
    else if(result>=75 && result<=79)
          gradePoint=(int) 9;
    else if(result>=70 && result<=74)
          gradePoint=(int) 8;
    else if(result>=65 && result<=69)
          gradePoint=(int) 7;
    else if(result>=60 && result<=64)
          gradePoint=(int) 6;
    else if(result>=55 && result<=59)
          gradePoint=(int) 5;
    else if(result>=50 && result<=54)
          gradePoint=(int) 4;
    else if(result>=45 && result<=49)
          gradePoint=(int) 3;
    else if(result>=40 && result<=44)
          gradePoint=(int) 2;
        else
            gradePoint=(int) 0.00;
   //return gradePoint;
		this.result= gradePoint;
	}
        
        

	@Override
	public void getResult() {
		System.out.println(name+"  Regristeration number " +registerationNumber+" Grades are : " +result+ "");
		System.out.println("");
	}

	  
	
	
}
public class Session_6_Assignment_4 {
 public static void main(String [] args) 
    {
       //Students of 2015 batch
		ResultProcessingSystem praveen= new StudentsOf2015(01, "Praveen ", 201501);
		System.out.println("Name = "+praveen.getName());
		System.out.println("Roll no = "+praveen.getRoll());
		System.out.println("Registration no = "+praveen.getRegistrationNum());
		praveen.setResult(70);
		praveen.getResult();
                
      //Students of 2016 batch
		ResultProcessingSystem arjun= new StudentsOf2016(03, "Arjun Kumar", 201601);
		System.out.println("Name = "+arjun.getName());
		System.out.println("Roll no = "+arjun.getRoll());
		System.out.println("Registration no = "+arjun.getRegistrationNum());
		arjun.setResult(62);
		arjun.getResult();

   }
}