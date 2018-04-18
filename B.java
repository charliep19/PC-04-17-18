import java.util.Scanner;
public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int [] nums= {5,22,15};
		int largest= nums[0];
			for(int i=0; i<3;i++) {
		if (nums[i]>largest) {
			largest=nums[i];
			
		}

		  }
			System.out.println(largest);
			
			int smallest= nums[0];	
			for(int i=0; i<3; i++) {
			
				if (nums[i]<smallest) {
				smallest=nums[i];
				
			}

			  }
				
			System.out.println(smallest);
	}

}
