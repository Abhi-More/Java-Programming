class MyThread1 extends Thread{
    public void run()
    {
        int i =0;
        while(i<25)
        {
            System.out.println("I am Watching video");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    public void run()
    {
        int i =0;
        while(i<25)
        {
            System.out.println("I am reading book");
            i++;
        }
    }
}
class MyThread3 extends Thread{
    public void run()
    {
        int i =0;
        while(i<25)
        {
            System.out.println("I am Playing WCC");
            i++;
        }
    }
}
class MyThread4 extends Thread{
    public void run()
    {
        int i =0;
        while(i<25)
        {
            System.out.println("I am Eating chips");
            i++;
        }
    }
}

public class Thread1 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        MyThread3 t3 = new MyThread3();
        MyThread4 t4 = new MyThread4();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

/*
PS C:\AbhishekCode> cd "c:\AbhishekCode\Java\MultiThreading\" ; if ($?) { javac Thread1.java } ; if ($?) { java Thread1 }
I am reading book
I am reading book  
I am reading book  
I am Eating chips  
I am Eating chips  
I am Playing WCC   
I am Watching video
I am Playing WCC   
I am Playing WCC   
I am Playing WCC
I am Playing WCC   
I am Playing WCC   
I am Playing WCC   
I am Playing WCC   
I am Playing WCC
I am Eating chips
I am reading book
I am reading book
I am reading book
I am reading book
I am reading book
I am reading book
I am reading book
I am Eating chips
I am Playing WCC
I am Playing WCC
I am Playing WCC
I am Watching video
I am Playing WCC
I am Playing WCC
I am Eating chips
I am reading book
I am reading book
I am Eating chips
I am Eating chips
I am Eating chips
I am Playing WCC
I am Playing WCC
I am Playing WCC
I am Playing WCC
I am Watching video
I am Watching video
I am Watching video
I am Watching video
I am Eating chips
I am Eating chips
I am Eating chips
I am Eating chips
I am Eating chips
I am Watching video
I am Watching video
I am Eating chips
I am Watching video
I am Watching video
I am Watching video
I am Eating chips
I am Eating chips
I am Eating chips
I am Watching video
I am Watching video
I am Watching video
I am Watching video
I am Watching video
I am Watching video
I am Watching video
I am Eating chips
I am Watching video
I am Watching video
I am Eating chips
I am Eating chips
I am Eating chips
I am Watching video
I am Watching video
I am Eating chips
I am Watching video
I am Eating chips
I am Eating chips
I am Eating chips
I am Watching video
I am Watching video
PS C:\AbhishekCode\Java\MultiThreading>
 */