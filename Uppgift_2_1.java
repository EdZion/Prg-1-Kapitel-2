/*
Övning 2.1 i boken
2019-09-13
Programmerare Alexander Holmström
*/
import javax.swing.*;
public class Uppgift_2_1{
	public static void main (String [] args){
		String namn;
		String adress;
		String tfnr;
		String allt;
		namn="Alexander Holmström";
		adress="Snovitsvagen 27";
		tfnr="07012345678";
		allt= namn +
			"\n" + adress +
				"\n" + tfnr;
			
		JOptionPane.showMessageDialog(null,allt);
	}
}