/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.connaissance.utill;

/**
 *
 * @author Dev
 */
public class Encription {
    private int e=3,d=187,n=319;
	char []num=new char[1000];
	public int modularExponentiation(int a, int b, int n)
	{
		int c=0,d=1;
		int []binary=new int[1000];
		int i=0,k=0;
		while(b>0)
		{
			binary[i]=b%2;
			i++;k++;
			b=b/2;
		}
		for(i=k-1;i>=0;i--)
		{
			c=2*c;
			d=(d*d)%n;
			if(binary[i]==1)
			{
				c=c+1;
				d=(d*a)%n;
			}

		}
			return(d);
	}

	public String encript(String es)
	{
		Encription en=new Encription();
		String es1="";
		for(int i=0;i<es.length();i++)
		{
			es1=es1+(char)(en.modularExponentiation(es.charAt(i),e,n));

		}
		return(es1);
	}

	

}
