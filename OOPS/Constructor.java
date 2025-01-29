package OOPS;

public class Constructor{
    
    public class JavaBasic{
    
        public static void main(String[] args) {
            
            // // Student s1 = new Student();
            
            // Student s2 = new Student("akhil");
            // System.out.println(s2.name);
    
            // Student s3 = new Student(533);
            // System.out.println(s3.roll);
        }
    }
    
    class Student{
    
        String name;
        int roll;
    
        // defining non-parameterized constuctor 
    
        Student(){
            System.out.println("Constructor called...");
        }
    
        //defining parameterized constuctor 
    
        Student(String name){
            this.name = name;
        }
    
        //defining parameterized(int type) constuctor
        Student(int roll){
            this.roll = roll;
        } 
    
    
    }

  
}

//copy constructor

// public static void main(String[] args) {
//     Student s1 = new Student();
//     s1.name = "Akhil";
//     s1.roll = 533;
//     s1.marks[0] = 7;
//     s1.marks[1] = 27;
//     s1.marks[2] = 72;

//     Student s2 = new Student(s1);

//     s1.marks[1] = 46;
//     s1.roll = 125;

//     for(int i=0;i<3;i++){
//         System.out.println(s2.marks[i]);
//     }
  

// }


// class Student{

// String name;
// int roll;
// int marks[] = new int[3];

// //copy constructor
// Student(Student s1){
//     this.marks = s1.marks;
//     this.name  = s1.name;
//     this.roll = s1.roll;
// }

// // defining non-parameterized constuctor 

// Student(){
//     System.out.println("Constructor called...");
// }

// //defining parameterized constuctor 

// Student(String name){
//     this.name = name;
// }

// //defining parameterized(int type) constuctor
// Student(int roll){
//     this.roll = roll;
// } 
// }