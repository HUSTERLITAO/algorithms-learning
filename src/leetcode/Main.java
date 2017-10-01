package leetcode;

public class Main
{
    //�����K���������ġ�λ����
    private static int getBits(int k)
    {
        int count=0;
        int bit=0;
        while(count<k)
        {
            ++bit;
            count+=Math.pow(2,bit);
        }
        return bit;
         
    }
     
     
    private static void slove(int[] arr)//static
     {
          
         for(int i=0;i<arr.length;i++)
         {
             int bits=getBits(arr[i]);
             int addOne=arr[i]+1;
             //��ʮ������ת��Ϊ�����ƴ�
             String bitStr=Integer.toBinaryString(addOne);
             //�������ƴ�ת��Ϊ�ַ����飻
             char[] bitArr=bitStr.toCharArray();
             //�Ƴ������ƴ��е����λ��1
             char[] reArr=new char[bits];
             StringBuilder str=new StringBuilder(bits);
             for(int j=0;j<bits;j++)
             {
                 reArr[j]=bitArr[j+1];
                //��01����Ϊ47��
                 if(reArr[j]=='0')
                 {
                     str.append('4');
                 }
                 else
                 {
                     str.append('7');
                 }
                     
             }//for
              
             System.out.println(str.toString());
         }
              
             
          
     }
      
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
     
         while(sc.hasNextInt())
         {
             int arrayNum=sc.nextInt();
             int[] inputNum=new int[arrayNum];
             for(int i=0;i<arrayNum;i++)
             {
                inputNum[i]=sc.nextInt();  
             }
              
             slove(inputNum);
              
          
         }//while
 
     }