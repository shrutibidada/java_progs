package crackTheInterviewSolutions;

public class NinetyDegree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] arr = new int[][]{{1,2,3,10},{4,5,6,11},{7,8,9,12},{13,14,15,16}};
		 for(int i=0;i<arr.length;i++)
		 {	
			 for(int j=0;j<arr[i].length;j++)
			 {
				 System.out.print(arr[i][j]);
			 }
			 System.out.println();
		 }
		 int [][] ansArr=new int[arr.length][arr.length];
		 for(int i=arr.length-1,k=0;i>=0 && k<arr.length;i--,k++)//row
		 {
				 for(int j=0;j<arr.length;j++ )// j is the new row and k is the column
				 {
				 
					 ansArr[j][k]=arr[i][j];
				 }
				 
			
		 }
		 for(int i=0;i<ansArr.length;i++)
		 {	
			 for(int j=0;j<ansArr[i].length;j++)
			 {
				 System.out.print(ansArr[i][j]);
			 }
			 System.out.println();
		 }
		
	}

}
