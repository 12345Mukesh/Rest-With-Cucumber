package Practice;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.*;

public class Program
{
 @Test
    public void sttest()
 {
     String s1="java";
     char a[]= {'j','a','v','a',' ','p','r','o','g','r','a','m','m','i','n','g'};
     String s2=new String(a);
     System.out.println(s1);
     System.out.println(s2);

        /*
       java
java programming
      */

     int n1=5, n2=10, max;

     max=(n1>n2)? n1:n2;
     /*
       variable=Expression1?Expression2:Expression3
       operates similarly to that of if-else statement
       if Expression 1 is true Expression 2 is executed
       else Expression 3 is executed
             */
     System.out.println(max);
 }

 @Test()
    public void maxandmin()
 {
     int a[]={1,123,6,46,34,23,13,53,4};

     Arrays.sort(a);
     System.out.println("min "+a[0]+" max "+a[a.length-1]);
 }

 @Test
    public void palindrome()
 {
     int a=565;
     int rev=0,rem;
     int s=a;
     while(a!=0)
     {
         rem=a%10;
         rev=rev*10+rem;
         a=a/10;
     }
     if(s==rev)
     {
         System.out.println("palindrome");
     }
     else
     {
         System.out.println("No palindrome");
     }

 }

 @Test
 public void reversestringandarray()
 {
     String sa="Mark";
     String s1="";
     for(int i=sa.length()-1;i>=0;i--)
     {
         s1=s1+sa.charAt(i);
     }

     System.out.println(s1);
     String s2="";

     /*
     Lowercase alphabet characters in ASCII have values ranging from 97 to 122,
      while uppercase alphabet characters have values ranging from 65 to 90
      */
     for(int i=0;i<s1.length()-1;i++)
     {
         if(s1.charAt(i)=='M')
         {
             s2=s1.toLowerCase();
         }
         else
         if(s1.charAt(i)>='a'&&s1.charAt(i)<='z')
         {
             s2=s1.toUpperCase();
         }
     }
     System.out.println(s2);



     String k="I Am what am i";
    // k=k.toLowerCase();
     String k1[]=k.split(" ");
     String k2="";
     for(int t=k1.length-1;t>=0;t--)
     {
      k2=k2+k1[t]+" ";
     }
     System.out.println(k2);




 }
  @Test
    public void ascendingorderanddescendingorderint()
  {
      int a[]={25,90,3,1,37,0,28,6};
      for(int i=0;i<a.length;i++)
      {
      for(int j=i+1;j<a.length;j++)

          {
              if (a[i]>a[j])
              {
                  int temp= a[i];
                  a[i]=a[j];
                  a[j]=temp;
              }
          }
       System.out.print(a[i] + " ");
      }

      System.out.println();

      for(int i=0;i<a.length;i++)
      {
          for(int j=i+1;j<a.length;j++)

          {
              if (a[i]<a[j])
              {
                  int temp= a[i];
                  a[i]=a[j];
                  a[j]=temp;
              }
          }
          System.out.print(a[i] + " ");
      }

  }


  @Test
  public void ascendinganddescendingchar()
  {
      char a[]={'j','a','u','g','m','l','h','z','b','c','k'};
      for(int i=0;i<a.length;i++)
      {
          for(int j=i+1;j<a.length;j++)

          {
              if (a[i]>a[j])
              {
                  char temp= a[i];
                  a[i]=a[j];
                  a[j]=temp;
              }
          }
          System.out.print(a[i] + " ");
      }

      System.out.println();

      for(int i=0;i<a.length;i++)
      {
          for(int j=i+1;j<a.length;j++)

          {
              if (a[i]<a[j])
              {
                  char temp= a[i];
                  a[i]=a[j];
                  a[j]=temp;
              }
          }
          System.out.print(a[i] + " ");
      }

  }

  @Test
    public void removeduplicates() {
      int a[] = {2, 37, 2, 25, 37, 1, 2, 25, 1, 97};

      for (int i = 0; i < a.length; i++) {
          int count = 1;
          for (int j = i + 1; j < a.length; j++) {
              if (a[i] == a[j]) {
                  count++;
                  a[j] = 0;
              }
          }
          if (a[i] != 0 && count >= 1) {
              System.out.println(a[i] + " value is :" + "and count is " + count);
          }
      }

  }

    @Test
    public void removeduplictesinString()
    {
        String s = "JamflastomIlakhatamafliya";
        s=s.toLowerCase();
        char s1[] = s.toCharArray();
        for (int i = 0; i < s1.length; i++) {
            int count = 1;
            for (int j = i + 1; j < s1.length; j++) {
                if (s1[i] == s1[j]) {
                    count++;
                    s1[j] = 0;
                }
            }
            if (s1[i] != 0 && count >= 1) {
                System.out.print(s1[i]);
            }
        }

        System.out.println();

        //For array
        String a="I am nobody where am I live to stay to live alive";
        String a1[]=a.split(" ");
        for(int u=0;u<a1.length;u++)
        {
            int count=1;
            for(int l=u+1;l<a1.length;l++)
            {
                if(a1[u].contentEquals(a1[l]))
                {
                    count++;
                    a1[l]="0";
                }
            }
         if(a1[u]!="0" && count>=1)
         {
          System.out.println(a1[u] + " count is :" +count);
         }

        }


    }


    @Test
    public void twodarray()
    {
        int a[][]= new int[4][3];
        a[0][0]=1;
        a[0][1]=0;
        a[0][2]=0;
        a[1][0]=2;
        a[1][1]=0;
        a[1][2]=0;
        a[2][0]=3;
        a[2][1]=0;
        a[2][2]=0;
        a[3][0]=4;
        a[3][1]=0;
        a[3][2]=0;

        for(int i=0;i<=3;i++)
        {
            for(int j=0;j<=1;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }



    }


  @Test
    public void countingwithinputvalue()
  {
      String  s="Automation with java using postman and restassured";
      s=s.replaceAll(" ","");
      s=s.toLowerCase();
      char ca[]=s.toCharArray();

      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the input value");
      char c=sc.next().charAt(0);


      for(int i=0;i<s.length();i++)
      {
          int count=1;
          if(ca[i]==c)
          {
              System.out.println(ca[i]+ " count is "+ count +" and position is "+i);
              for(int j=0;j<s.length();j++)
              {
                  if(ca[i]==ca[j])
                  {
                      count++;
                      ca[j]=0;
                      System.out.println(ca[i]+ " count is "+ count +" and position is "+j);
                  }
              }
          }

      }
  }

  @Test
  public void countinputvariablewitharray()
  {
      String  s="Automation with java using postman and restassured";
      String s1[]=s.split(" ");

      Scanner scan= new Scanner(System.in);
      System.out.println("Enter the input string");
      String sc=scan.nextLine();

      for(int i=0;i<s1.length;i++)
      {
          int count=1;

          if(s1[i].contains(sc))
          {
              System.out.println(s1[i]+ " count is "+ count +" and position is "+i);
              for(int j=i+1;j<s1.length;j++)
              {
                  if(s1[i].equals(s1[j]))
                  {
                      count++;
                      s1[j]="0";
                      System.out.println(s1[i]+ " count is "+ count +" and position is "+j);
                  }
              }


          }
      }

  }



@Test
    public void vowel()
{
    String s="vowel with consonant";
    s=s.replaceAll(" ","");
    String s1=s.replaceAll("[aeiou]","");
    String s2=s.replaceAll("[^aeiou]","");
    System.out.println("After removing vowel: "+s1);
    System.out.println("Same logic with vowel: "+s2);

}

@Test
    public void matrix()
{
    for(int i=1;i<=5;i++)
    {
        System.out.print("[");
        for(int j=1;j<=3;j++)
        {
            System.out.print("3");
        }
        System.out.print("]");
        System.out.println();
    }
}

@Test
    public void leapyear()
{
    int year=2024;

    /*
      System.out.println("Enter an Year :: ");
      Scanner sc = new Scanner(System.in);
     int year = sc.nextInt();
  */

    if (year % 4 == 0)
        System.out.println("Specified year is a leap year");
    else
        System.out.println("Specified year is not a leap year");

    for(int k=0;k<=10;k++)
    {

        if(k==5)
        {
            System.out.println(k);
          break;
        }
        System.out.println("Before breaking "+k);
    }
}

@Test
    public void charactercasing()
{
    int a=5,b=10;
    int large=a>b?a:b;
    System.out.println(large);
    String k="";
    String l="";
    int count=0, shape=0;
    String s="Automation With SELENIUM ";
    s=s.replaceAll(" ", "");
    char[]c=s.toCharArray();
    for(int i=0;i<s.length();i++)
    {
        if(c[i]>='A'&&c[i]<='Z')
        {
            k=k+c[i];
            count++;
        }

        else
        {
            l=l+c[i];
            shape++;
        }

    }
    System.out.println("upper case characters are " +k+" and count is " + count);
    System.out.println("lower case characters are "+l+" and count is " + count);


    }

  @Test
    public void lengthandreverse()
  {
      String s="hello world";
      int a=s.length();
      System.out.println(a);
      String s1[]=s.split(" ");
      String s2="";

      if(s.contains("world"))
      {
          for(int i=s1.length-1;i>=0;i--)
          {
              s2=s2+s1[i]+" ";
          }
      }
      System.out.println(s2);

  }

  @Test
    public void arrayinputtables()
  {
      int a[]={3,5,8,9};
      int table;

      for(int i=0;i<a.length;i++)
      {
          for(int j=1;j<=10;j++)
          {
              System.out.println(a[i] +"*"+j+"="+a[i]*j);

          }
          System.out.println("-----------------------");
      }

  }


  @Test
    public void singletable()
  {
      int a=5, k=1,j=0;
      while(k<=10)
      {
        j=j+a;
          System.out.println(a+"*"+k+"="+j);
        k++;
      }

  }

  @Test
    public void multipletables()
  {
      for(int i=2;i<=20;i++)
      {
          for(int j=1;j<=10;j++)
          {
              System.out.println(i+"*"+j+"="+i*j);
          }
         System.out.println("-----------------------");
      }


  }


@Test
    public void primenumsingle()
{
    int num=23;
    int count=0;
    for(int i=1;i<=num;i++)
    {
        if (num % i == 0)
        {
            count++;
        }
    }
    if(count==2)
    {
        System.out.println("prime number");
    }
    else
    {
        System.out.println("No prime number");
    }
}

@Test
public void setofprimenumbers()
{
    for(int i=2;i<=50;i++)
    {
        int count=0;
        for(int j=1;j<=i;j++)
        {
            if(i%j==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println(i+" prime number");
        }
        else
        {
            System.out.println(i+" Not a prime number");
        }

    }


}


@Test
    public void setofinputprimenumbers()
{

    int a[]={25,31,97,17,1,35,13,22,7};


    for(int i=0;i<a.length;i++)
    {
        int count=0;
        for(int j=1;j<=a[i];j++)
        {
            if(a[i]%j==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println(a[i]+" prime number");
        }
        else
        {
            System.out.println(a[i]+" Not a prime number");
        }

    }




}


@Test
    public void fibonacci()
{
    int n1=0,n2=1,n3;

    System.out.print(n1+ " ");
    for(int i=0;i<=10;i++)
    {
        n3=n1+n2;
        System.out.print(n3 + " ");
        n1=n2;
        n2=n3;
    }


}


@Test
    public void factorial()
{
    int fact=1;
    for(int i=1;i<=5;i++)
    {
        fact=fact*i;
    }
    System.out.println(fact);
}



@Test
    public void swappingvariable()
{
    int a=5,b=7;

    a=a+b;
    b=a-b;
    a=a-b;

    System.out.println(a);
    System.out.println(b);

}


@Test
    public void sample()
{
    int num=370;
    int rev=0,rem;
    int sum=num;
    while(num!=0)
    {
        rem=num%10;
        rev=rev+(rem*rem*rem);
        num=num/10;

    }
    System.out.println(rev);
    if(rev==sum)
    {
        System.out.println("ArmStrong number");
    }
    else
    {
        System.out.println("No Armstrong number");
    }
}


@Test
    public void arrayrev()
{
    Scanner scan= new Scanner(System.in);
    System.out.println("Enter the input size");
    int s=scan.nextInt();
    String a[]= new String[s];
    String s2="";

    System.out.println("Enter values one by one");
    for(int i=0;i<a.length;i++)
    {
        a[i]=scan.nextLine();
    }

    for(int k=0;k<a.length;k++)
    {
        if(a[k].contains("world"))
        {
            for(int j=a.length-1;j>=0;j--)
            {
                s2=s2+a[j]+" ";
            }

        }
    }

    System.out.println(s2);

    try {

    }

    catch (Exception e)
    { throw new RuntimeException(e);
    }
}

  }