  public class Course extends CourseDemo {
    
  private int courseID;
  private String title;
  private int credits; 
  private static int count; 
  
    public Course(int cid, String t, int cre)
    {
    courseID=cid;
    title=t;
    credits=cre;
    count++;
    }
    public void setCourseID(int cid)
    {
    courseID=cid;
    }
    public void setTitle(String t)
    {
    title=t;  
    }
    public void setCredits(int cre)
    {
    credits=cre;
    }
    public int getCourseID()
    {
      return courseID; 
    }
    public String getTitle()
    {
      return  title; 
    }
    public int getCredit()
    {
      return credits; 
    }
    public static int getCount() 
    {
    return count;  
    }
    public String printInfo()
    {
    return "Course ID: "+ courseID +" Title: "+ title + " Credits: " + credits;  
    }
}


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
