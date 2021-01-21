import java.util.*;
class stack1
{
    int top=-1;
    int arr[];
    int n;
    stack1(int n)
    {
        this.n=n;
        arr=new int[n];
    }
    stack1()
    {
    }
    void push(int s)
    {
        if (top>=n-1)
        {
        System.out.println("stack is full");
        }
        else
        {
    arr[++top]=s;
    }
    }
int pop()
{
    if (top==-1)
    {
    System.out.println("stack is empty");
    return 0;
    }
    else
    {
 return arr[top--];
}
}
    int calc(String input)
    {
     int n=input.length();
     stack1 o=new stack1(n);
     for(int i=n-1;i>=0;i--)
     {
char ch=input.charAt(i);
    if (ch>='0'&&ch<='9')
    {
    o.push(Character.getNumericValue(ch));
    }
    else
    {
int x=o.pop();
int y=o.pop();
int c=0;
switch(ch)
{
case ('*'):
    c=x*y;
    break;
    case ('/'):
    c=x/y;
    break;
    case ('+'):
    c=x+y;
    break;
    case ('-'):
    c=x-y;
    break;
}
o.push(c);
}
}
int r=o.pop();
return r;
}
}    
    public class prefix
    {
    public static void main(String g[])
    {
try
{
    Scanner sc=new Scanner(System.in);
    String input=sc.nextLine();
    stack1 obj=new stack1();
    System.out.println(obj.calc(input));
    }
    catch(Exception e)
    {
    System.out.println("exception ccurred");
    }
    }
    }