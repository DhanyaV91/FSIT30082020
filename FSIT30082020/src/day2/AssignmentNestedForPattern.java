package day2;

public class AssignmentNestedForPattern {

	public static void main(String[] args) {
		int row;
		for(row=0;row<=7;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col);
			}
			System.out.println();
		}
		for(int i=row-1;i>=1;i--) {
			for(int col=1;col<i;col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}

}
