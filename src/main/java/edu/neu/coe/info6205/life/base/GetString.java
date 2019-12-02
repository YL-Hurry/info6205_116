package edu.neu.coe.info6205.life.base;



import java.util.Arrays;


public class GetString {

    public String randomString(){
        int length = (int)( 5 * Math.random())+10;
        String[] s=new String[length];
        for(int i=0;i<length;i++){
            int x =(int)(Math.random()*20)-10;
            int y =(int)(Math.random()*20)-10;
            s[i]=x+" "+y;
        }

        return Arrays.toString(s).substring(1, Arrays.toString(s).length() - 1);
    }

    public static void main(String[] args) {
        GetString g=new GetString();
        System.out.println(g.randomString());
    }
}
