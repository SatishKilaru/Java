class cla{
	public static void main(String args[]){
		int a[]=new int[5];
		for(int i=0;i<5;i++){
			a[i]=Integer.parseInt(args[i]);
		}
		System.out.println("Arguments  "+a[0]);
	}
}