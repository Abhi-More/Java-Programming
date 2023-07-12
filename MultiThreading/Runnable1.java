class MyThreadRunnable1 implements Runnable{
    public void run(){
        int i = 0;
        while(i!=25){
            System.out.println("Runnable Tread First");
            i++;
        }
    }
}

class MyThreadRunnable2 implements Runnable{
    public void run(){
        int i = 0;
        while(i!=25){
            System.out.println("Runnable Tread Second");
            i++;
        }
    }
}

public class Runnable1 {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
/*
PS C:\AbhishekCode> cd "c:\AbhishekCode\Java\MultiThreading\" ; if ($?) { javac Runnable1.java } ; if ($?) { java Runnable1 }
Runnable Tread First
Runnable Tread First 
Runnable Tread Second
Runnable Tread Second
Runnable Tread Second
Runnable Tread First 
Runnable Tread First 
Runnable Tread First 
Runnable Tread First
Runnable Tread First
Runnable Tread First
Runnable Tread First
Runnable Tread First
Runnable Tread Second
Runnable Tread Second
Runnable Tread Second
Runnable Tread First
Runnable Tread First
Runnable Tread First
Runnable Tread First
Runnable Tread First
Runnable Tread Second
Runnable Tread Second
Runnable Tread Second
Runnable Tread First
Runnable Tread First
Runnable Tread First
Runnable Tread Second
Runnable Tread Second
Runnable Tread Second
Runnable Tread Second
Runnable Tread Second
Runnable Tread Second
Runnable Tread Second
Runnable Tread First
Runnable Tread First
Runnable Tread First
Runnable Tread First
Runnable Tread Second
Runnable Tread Second
Runnable Tread Second
Runnable Tread First
Runnable Tread First
Runnable Tread Second
Runnable Tread Second
Runnable Tread First
Runnable Tread Second
Runnable Tread Second
Runnable Tread Second
Runnable Tread Second
PS C:\AbhishekCode\Java\MultiThreading> 
 */