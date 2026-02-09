public class CourseDemo
{


  public static void main(String []args)
  {
    
   Course o1= new Course(4002, "Intro to AI", 3); 
   Course o2= new Course(4005, "Intro to ML", 3); 
   System.out.println(o1.printInfo());
   System.out.println(o2.printInfo());
   
   System.out.println("Number of Instances :"+ Course.getCount());
  }

}