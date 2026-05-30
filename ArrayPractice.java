class ArrayPractice{
  public static void main(String args[]){

    // int  number[] ={1, 2, 3, 4, 5  }; // This creates an array of integers with the values 1, 2, 3, 4, and 5, stored in the heap memory  
    int numbers[] = new int[5] ; // This creates an array of integers with a size of 5, stored in the heap memory
    numbers[0] = 1; // Assigning values to the array elements
    numbers[1] = 2;
    numbers[2] = 3;
    numbers[3] = 4;
    for(int i =0 ;i< numbers.length; i++){
      System.out.println(numbers[i]); // This will print the values of the array elements, with uninitialized elements defaulting to 0
    }


     Student s1 = new Student();
	    s1.name = "ujjwal";
	    s1.marks =22;
	    s1.rollNumber =1;
	    
	    Student s2 = new Student();
	    s2.name =" Rushi";
	    s2.marks= 23;
	    s2.rollNumber =2;
        
        Student s3 = new Student();
 s3.name =" Rushi";
	    s3.marks= 24;
	    s3.rollNumber =3;
	    
	    Student students[] = new Student[3];
	    students[0] = s1;
	    students[1] = s2;
	    students[2]= s3;
	    
	    for( int i=0 ; i< students.length ; i++){
	        System.out.println(students[i].name + "=" + students[i].marks);
	        
	    }
	    
  }
}

class Student {
    String name;
    int marks ;
    int rollNumber;
}