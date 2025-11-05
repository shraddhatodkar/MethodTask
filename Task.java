package com.sjt.method;
public class Task {
    public void method()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("From 1 to 10 nos are:" +i);
		}
	}
	public void PrintRange(int a,int b){
		for(int i=a;i<=b;i++)
		{
			System.out.println(i);
		}
	}
	public void PrintOdd(int p,int q){
		for(int i=p;i<q;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
	public void PrintSquare(int l,int m){
		for(int i=l;i<=m;i++)
		{
			int square=i*i;
			System.out.println(square);
		}
	}
	public void PrintSum(int j,int k){
	int sum=0;
	for(int i=j;i<=k;i++)
	{
		sum+=i;
		System.out.println(sum);
	}
}
	public void PrintProduct(int s,int t){
		for(int i=s;i<=t;i++)
		{
			int square=i*i;
			int product=square*i;
            System.out.println(product);
		}
	}
}
