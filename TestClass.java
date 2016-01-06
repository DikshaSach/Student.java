import javax.swing.*;
import java.util.*;

public class TestClass {
	
	 public static int GenerateRandom(int min, int max){
	
	return(int)Math.floor(Math.random()*max) + min;}
	
	public static void main (String[] args){
		int numOfStudents= Integer.parseInt(JOptionPane.showInputDialog("Please enter the amount of students whos information you would like to create:"));
	String[] lastNames= new String[]{ "Peterson", "Jackson", "Michaels"} ;
	String [] firstNames = new String[]{"Bryan", "Larray", "Susan"};
	String[] gpas = new String[] {"1.0", "4.0" , "3.0", "2.0" , "2.3" , " 3.4", "3.9"};
	String[] cunyIds = new String[]{"12345678", "12312456", "54675632", "40983218", "98023561", "23078625", "71923456"};
	
	Student[] someStudents = new Student[numOfStudents];
	for(int i=0; i<someStudents.length; i++)
	{
		someStudents[i]= 
				new Student (firstNames[GenerateRandom(1,firstNames.length) -1],
						lastNames[GenerateRandom(1,lastNames.length)-1 ], 
						cunyIds[GenerateRandom(1,cunyIds.length)-1],
						gpas[GenerateRandom(1, gpas.length)-1]);
	}
					for (int i =0 ; i<someStudents.length; i++)
					{
						someStudents[i].displayAttributes();
						someStudents[i].isValidVenusLogin();
					}
		}
}
	
	
	
	

