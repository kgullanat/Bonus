
public abstract class Employee {
	BonusCalculator bonuscalculator;
	void setB (int n){
		
		System.out.println("��⺹��������鹨ҡ���"+n+"��"+(bonuscalculator.computerBonus(n)));
	}

}
