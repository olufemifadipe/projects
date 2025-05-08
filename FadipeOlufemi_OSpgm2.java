 /*********************************************************************
        Author    : Olufemi Fadipe 
        Course    : CGS3767 Computer OS for IT - Summer.
        Professor : Michael Robinson 
        Program # : Program Purpose/Description 
        This program will take Hexidecial data and convert it to binary, then convert the binary into deciamal values to located the a RAM chip error.Additionally this program will display the ASCII values in decimals of the alphabets(upper and lower cases).               

        Due Date  : 06/06/2021 


        Certification: 
        I hereby certify that this work is my own and none of it is the work of any other person. 

        ..........{ Olufemi Rafael Fadipe }..........
       *********************************************************************/

import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FadipeOlufemi_OSpgm2 
{

    public static String convertHexToBinary(String hex) 
    { // array - loop - convert from hex to binary

    String binary = "";
    int x;

    for (x = 0; x < hex.length(); x++) 
    {
    char c = hex.charAt(x);

    switch (c) //switch stament
    {

    case '0': binary += "0000"; break;
    case '1': binary += "0001"; break;
    case '2': binary += "0010"; break;
    case '3': binary += "0011"; break;
    case '4': binary += "0100"; break;
    case '5': binary += "0101"; break;
    case '6': binary += "0110"; break;
    case '7': binary += "0111"; break;
    case '8': binary += "1000"; break;
    case '9': binary += "1001"; break;
    case 'A': binary += "1010"; break;
    case 'B': binary += "1011"; break;
    case 'C': binary += "1100"; break;
    case 'D': binary += "1101"; break;
    case 'E': binary += "1110"; break;
    case 'F': binary += "1111"; break;
    }

    }
    return binary;

    }


    public static long convertBinaryToDecimal(String binary) 
    {
    // convertion from binary to decimal
    long decimal = 0;
    int x;
    for (x = 0; x < binary.length(); x++) 
    {
    char c = binary.charAt(x);
    if (c == '1') 
    {
    decimal += Math.pow(2, binary.length() - x - 1);
    }

    }
    return decimal;

    }


    public static int findChipNumber(long chipNum)  
    {//loop to find the error on the chip
    if (chipNum < 0 || chipNum > 274877906958L) 
    {
    return -1;
    }
    if (chipNum <= 34359738369L) 
    {
    return 0;
    }
    else if (chipNum <= 68719476739L)
    {
    return 1;
    }
    else if (chipNum <= 103079215109L) 
    {
    return 2;
    }
    else if (chipNum <= 137438953479L) 
    {
    return 3;
    }
    else if (chipNum <= 171798691849L) 
    {
    return 4;
    }
    else if (chipNum <= 206158430219L) 
    {
    return 5;
    }
    else if (chipNum <= 240518168589L)
    {
    return 6;
    }
    else
    {
    return 7;
    }

    }
 

    public static void heading()
    {
    //heading display
    System.out.printf("\n%s\n","     Hex   =            Binary                        =    Decimal   =   Chip Number");    
    }


    public static void output(String hex, String binary, long decimal, int chipNum) 
    {
    //outputs for converted data   
    System.out.printf("%s = %s = %d = %d\n", hex, binary, decimal, chipNum);
    }

    
    public static void outputWithText(String hex, String binary, long decimal, String chipNum) 
    {
    //output for data the chip with an error- N/A  
    System.out.printf("%s = %s  = %d = %s\n", hex, binary, decimal, chipNum);
    }
    

    public static void lowerCase() 
    {
    // ASCII lower case values
    for (int x = 97; x <= 122; x++) //loop
    {

    System.out.printf("%s = %d\n", (char)x, x);
    }

    }


    public static void upperCase() 
    {
    // ASCII upper case values
    for (int x = 65; x <= 90; x++)//loop 
    {
    System.out.printf("%s = %d\n", (char)x, x);
    }
    }
    
    
    public static void main(String[] args) throws IOException 
    {

    heading();//method call for the heading of the data 
    try 
    {
    // Reading from file
    File file = new File("RAMerrors8x4f.6");
    Scanner sc = new Scanner(file);
            

    while (sc.hasNextLine()) //condition to read next line
    { 
    String hex = sc.nextLine().trim();
    String binary = convertHexToBinary(hex);//method call 
    long decimal = convertBinaryToDecimal(binary);//method call
    int chipNumber = findChipNumber(decimal);//method call
                
    if (chipNumber < 0) // loop for the chip with the error
    {
                    
    outputWithText(hex, binary, decimal, "N/A");
                
    }
    else
    output(hex, binary, decimal, chipNumber);//method call
    }
    sc.close();

    }
    catch (FileNotFoundException e) 
    {
    System.out.printf("%s\n", "File not found");
    }

    lowerCase();//method call- ASCII lower case
    upperCase();//method call- ASCII upper case
    }


}
