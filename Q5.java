/*this program is to check the frequancy of a letters in your string*/
class FrQ5{
	public static void main(String a[]){
		String s= new String(a[0]);

		int n=s.length(),count=0;	
		for(int i=0;i<n;i++){
			for(int j=0;j<s.length();j++){
				if(s.charAt(i)==s.charAt(j)){
					count++;			
				}
			}
			System.out.println(s.charAt(i)+"'s frequancy is -->"+count);
			      
			count=0;
		}
	}
}

