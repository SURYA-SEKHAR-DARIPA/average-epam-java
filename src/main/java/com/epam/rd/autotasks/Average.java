package com.epam.rd.autotasks;

import java.util.Scanner;
import java.util.*;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp=0;
        int cal=0;
        // Use Scanner methods to read input
        ArrayList u=new ArrayList<>();
        while(true){
            int a=scanner.nextInt();
            if(a!=0){
                u.add(a);
                temp=temp+a;
                cal++;

            }
            else{
                break;
            }
        }

    
    System.out.println(temp/cal);
    
}

}