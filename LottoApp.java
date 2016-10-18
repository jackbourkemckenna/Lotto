import javax.swing.JOptionPane;

public class LottoApp{
	public static void main(String args[]){
		/*
		 int num1;
		 int num2;
		 int num3;
		 int num4;
		 int num5;
*/
//using array
		int nums[] = new int[5];
		int lnums[] = new int[5];
		int myCorrectNumbers;
		 //declare objects
		 Lotto lot;
		 lot=new Lotto();
		//take in guesses
		/*
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a lotto nummber"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a lotto nummber"));
		num3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a lotto nummber"));
		num4 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a lotto nummber"));
		num5 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a lotto nummber"));
		*/
		for(int j=0; j<3; j++){

			for(int i=0;i<5;i++){
			nums[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a lotto nummber"));
			}
			JOptionPane.showMessageDialog(null,"Enter the next line ");
		}
		lot.setGuesses(nums);

		//set guesses#
		/*
		lot.setLotto1(num1);
		lot.setLotto1(num2);
		lot.setLotto1(num3);
		lot.setLotto1(num4);
		lot.setLotto1(num5);
		*/
		//compute
		lot.checkNumbers();
		//get amount of correct ans
		myCorrectNumbers=lot.getMyCorrectNumbers();
		//output
		JOptionPane.showMessageDialog(null,"you got " +myCorrectNumbers+ "correct");
		}
	}