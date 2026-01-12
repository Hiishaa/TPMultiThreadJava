package com.devops;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ThreadMatch thread1 = new ThreadMatch("Lyon", "Marseille", 3, 0, 0);
        ThreadMatch thread2 = new ThreadMatch("Saint-Etienne", "Lyon", 3, 0, 0);
        ThreadMatch thread3 = new ThreadMatch("Marseille", "Saint-Etienne", 3, 0, 0 );
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);
        t1.start();
        try
        {
            t1.join();
        } catch (Exception ex){

        }

        t2.start();
        try
        {
            t2.join();
        } catch (Exception ex){

        }

        t3.start();
        try
        {
            t3.join();

        } catch (Exception ex){

        }

    }
}
