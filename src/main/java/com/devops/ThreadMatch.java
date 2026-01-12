package com.devops;

public class ThreadMatch implements Runnable {

    String equipe1;
    String equipe2;
    int nbCommentaires;
    int scoreEquipe1;
    int scoreEquipe2;

    public ThreadMatch(String equipe1, String equipe2, int nbCommentaires, int scoreEquipe1, int scoreEquipe2) {
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
        this.nbCommentaires = nbCommentaires;
        this.scoreEquipe1 = scoreEquipe1;
        this.scoreEquipe2 = scoreEquipe2;
    }

    @Override
    public void run() {
        System.out.println("Début du match : " + this.equipe1 + " - " + this.equipe2);
        for (int i = 0; i < 3; i++) {

            String comment = CommentGenerator.getRandomComment();
            System.out.println(this.equipe1 + " - " + this.equipe2 + " : " + comment);
            if (comment.contains("But des locaux")) {
                scoreEquipe1++;
            } else if (comment.contains("But des visiteurs")) {
                scoreEquipe2++;
            }
        }
        try {
            Thread.sleep((int) (Math.random() * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fin du match entre "+this.equipe1 + " et " +this.equipe2 +"|"+"Score final : "+this.scoreEquipe1 + " - " +this.scoreEquipe2);
    }

}
