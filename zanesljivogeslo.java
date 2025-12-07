import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner vh=new Scanner(System.in);
        System.out.print("Vnesi dolzino gesla:   ");
        int x=vh.nextInt();
        for(int i=0;i<x;i++){
            int r=(int)(Math.random()*4+0);
            if(r==0){
                char r1=(char)(Math.random()*25+65);//random velike crke
                System.out.print(r1);
            }
            else if(r==1){
                int r2=(int)(Math.random()*10+0);// random stevke
                System.out.print(r2);
            }
            else if(r==2){
                char r3=(char)(Math.random()*25+97);//random male crke
                System.out.print(r3);
            }
            else{
                char r4=(char)(Math.random()*15+32); //random znaki
                System.out.print(r4);
            }
        }
        
    } 
}