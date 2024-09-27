package pattern;

public class SquareNumb {

	public static void main(String[] args) {
		int n =7;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||j==0||i==n-1||j==n-1) {
					System.out.print("4 ");
				}else if(i==1||j==1||i==n-2||j==n-2) {
					System.out.print("3 ");
				}else if(i==2||j==2||i==n-3||j==n-3) {
					System.out.print("2 ");
				}else if(i==n/2 && j==n/2) {
					System.out.print("1 ");
				}else {
					System.out.print(" ");
				}
			}
				System.out.println(" ");
		}
	}
}
