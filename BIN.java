import java.util.Scanner;
import java.text.DecimalFormat;

public class BIN {

	public static void main(String[] args) {
		DecimalFormat dc=new DecimalFormat("0.00");
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		int x=0;
		String[] ar=new String[10000];		
double max=0;
		while(x<n)
		{
			ar[x]= sc.nextLine();
			x++;
		}
		String[] name=new String[x];
		double[] added=new double[x];
		
		int i=0;
		for(int a=0;a<x;a++){
		
	
		String[] all=ar[a].split(" ");
		

		
		
		name[a]=all[0];
		

		int w=Integer.parseInt(all[1].charAt(0)+"");
		int l=Integer.parseInt(all[1].charAt(2)+"");
		
		int total=0;
		for(int b=2;b<all.length;b++){
			total+=Integer.parseInt(all[b]);
		}
		
		double store=(total+400*(w-l))/(all.length-2);
		added[a]=store;
		max=dc.format(store);
		
		if(a>1){
		if((added[a]>added[a-1])){
			double temp=added[a-1];
			added[a-1]=max;
			added[a]=temp;
			String t1=name[a-1];
			name[a-1]=name[a];
			name[a]=t1;
		}
		}
		}
	
	for(int q=0;q<n+1;q++){
		System.out.println(q+")"+name[q]+" "+added[q]);
	}
	
	
	
	
	}

}
