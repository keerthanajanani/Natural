# Natural
import java.io.*;
import java.util.*;
public class Natural
{
public static void main(String args[])throws IOException
{
int n,i=1;
int sum=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the sum");
n=Integer.parseint(br.readLine());
while(i<=n)
{
sum=sum+n;
n++;
}
System.out.println("The sum of the number is: "+sum);
}
}
