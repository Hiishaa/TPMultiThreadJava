package com.devops;

public class ThreadMatch implements Runnable{

    String equipe1;
    String equipe2;

    public ThreadMatch(String equipe1, String equipe2) {
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
    }

    @Override
    public void run(){

            for(int i = 0; i < 2; i++ )
            {
           System.out.println("Début du match : " + this.equipe1 + " - " + this.equipe2);
           String comment = CommentGenerator.getRandomComment();
           System.out.println(comment);
           try{
           Thread.sleep((int)(Math.random()*10000));
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
        }
    }
}
