 /*********************************************************************
        Author    : Olufemi Fadipe 
        Course    : CGS3767 Computer OS for IT - Summer.
        Professor : Michael Robinson 
        Program # : Program Purpose/Description 
                    This program will pass viables from the class to main and display them along with the answer to questions about on gedit and the beneits of VMs

        Due Date  : 05/22/2021 


        Certification: 
        I hereby certify that this work is my own and none of it is the work of any other person. 

        ..........{ Olufemi Rafael Fadipe }..........
       *********************************************************************/



class FadipeOlufemiubuntuPgm1
{

    public static void processUbuntu(String Name, double Number, String Semester)
    {

        //Display Accepted Data
        System.out.printf("%s\n",Name);
        System.out.printf("%16.5f%n",Number);
        System.out.printf("%s%n",Semester.toUpperCase()); 

        //Display Commands
        System.out.printf("%s\n","Editor: Gedit");
        System.out.printf("%s\n","Command to Save: CTRL+S");
        System.out.printf("%s\n","Command to Exit without saving: CTRL+W");
        
        //Display Answers to Questions on VMs
        System.out.printf("%s\n","Benefits of VMs:");
        System.out.printf("%s\n\n","1) Cost. If you want to have multiple VMs in one HOST computer, you need to install a Virtual Machine software, and in it, you can install multiple Operating Systems, each independent of each other, all Virtual OSs use the same hardware that the HOST computer has, including the Internet access and printers accessible to the HOST.");

        System.out.printf("%s\n\n","2) Security. If any of the Virtual OS gets a virus, all other OSs including the HOST wil NOT be affected by the infected Virtual OS, unless you created tunnels/connecting paths between Operating Systems.");   

        System.out.printf("%s\n\n","3) Maintenace. If a Virtual OS becomes unstable you can delete it without affecting all other Virtual OSs or the HOST OS.");

        System.out.printf("%s\n","Problems with HOST Computers");
        System.out.printf("%s\n","1) Lost of Power or Connectivity. If a HOST computer losses power or connectivity to the network, all Virtual VMs get disconnected.");

    }


    public static void main(String[] args)
    {
    
        //Method Call- Accepting data
        processUbuntu("Olufemi Fadipe", 2021.99,"Fall");

       
 
    }

    
}
