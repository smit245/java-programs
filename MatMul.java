import java.util.Scanner;
class MatMul{
	public static void main(String a[]){
		int[][] mat1;
		int[][] mat2;
		int[][] mul;
		// int s1=Integer.parseInt(a[0]);
		// int s2=Integer.parseInt(a[1]);
		// int s3=Integer.parseInt(a[2]);	
		// int s4=Integer.parseInt(a[3]);
		Scanner x= new Scanner(System.in);
		System.out.println("Please give row of an array 1:-");
		int s1=x.nextInt();
		System.out.println("Please give column of an array 1:-");
		int s2=x.nextInt();
		System.out.println("Please give row of an array 2:-");
		int s3=x.nextInt();
		System.out.println("Please give column of an array 2:-");
		int s4=x.nextInt();
		if(s2!=s3){
			System.out.println("Column of first matrix and Row of second matrix must be same");
				
		}
		else{
			mat1=new int[s1][s2];
			System.out.println("Enter Matrix 1:");
			for(int i=0;i<s1;i++){
				for(int j=0;j<s2;j++){
					System.out.print("matrix 1["+i+"]["+j+"]:-");
					mat1[i][j]=x.nextInt();
				}			
			}
			mat2=new int[s3][s4];
			System.out.println("Enter Matrix 2:");
			for(int i=0;i<s3;i++){
				for(int j=0;j<s4;j++){
					System.out.print("matrix 2["+i+"]["+j+"]:-");
					mat2[i][j]=x.nextInt();
				}
				
			}
			mul=new int[s1][s4];
			for(int i=0;i<s1;i++){
				for(int j=0;j<s4;j++){
					for(int k=0;k<s2;k++){
						mul[i][j]=mul[i][j]+(mat1[i][k]*mat2[k][j]);
					}
				}
			}
			for(int i=0;i<s1;i++){
				for(int j=0;j<s4;j++){
					System.out.print(" "+mul[i][j]+" ");
				}
				System.out.println("");
			}

		}
		
	}
}