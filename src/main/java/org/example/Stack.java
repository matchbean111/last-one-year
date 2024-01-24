package org.example;

public class Stack {
    int c = 0;
    public static void main(String[] args) {
        new Stack().a();
    }

    public void a() {
        try {
            int[] arr = new int[1024];
            c += 1024;
       
         
            b();
        } catch (StackOverflowError e) {
            System.out.println(c);
        }
        
    }

    public void b() {
        try {
            int[] arr = new int[1024];
            c += 1024;
            
            a();
        } catch(StackOverflowError e) {
            System.out.println(c);
        }
        
    }
}
