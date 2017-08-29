
public abstract class Employee {
	BonusCalculator bonuscalculator;
	void setB (int n){
		
		System.out.println("ได้โบนัสเพิ่มขึ้นจากเดิม"+n+"เป็น"+(bonuscalculator.computerBonus(n)));
	}

}
