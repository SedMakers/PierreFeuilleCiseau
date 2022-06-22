package fr.afpa.pierrefeuilleciseau;

import java.util.Random;

public class Jeu {
	

	private int scoreJoueur = 0;
	private int scoreIA = 0;

	
	public int getScoreJoueur() {
		return scoreJoueur;
	}

	public void setScoreJoueur(int scoreJoueur) {
		this.scoreJoueur = scoreJoueur;
	}

	public int getScoreIA() {
		return scoreIA;
	}

	public void setScoreIA(int scoreIA) {
		this.scoreIA = scoreIA;
	}

	public void choixCompare(Choix choixJoueur, Choix choixIA1) {
		String Resultat;
		if(choixJoueur == Choix.PIERRE && choixIA1 == Choix.PIERRE ) {
			Resultat = "égalité !";
			System.out.println(Resultat);
		}else if(choixJoueur == Choix.PIERRE && choixIA1 == Choix.FEUILLE){
			Resultat ="IA Gagne !";
			scoreIA++;
			System.out.println(Resultat);
		}else if(choixJoueur == Choix.PIERRE && choixIA1 == Choix.CISEAU) {
			Resultat ="Joueur Gagne !";
			scoreJoueur++;
			System.out.println(Resultat);
		}else if(choixJoueur == Choix.FEUILLE && choixIA1 == Choix.PIERRE) {
			Resultat ="Joueur Gagne !";
			scoreJoueur++;
			System.out.println(Resultat);
		}else if(choixJoueur == Choix.FEUILLE && choixIA1 == Choix.FEUILLE) {
			Resultat ="égalité !";
			System.out.println(Resultat);
		}else if(choixJoueur == Choix.FEUILLE && choixIA1 == Choix.CISEAU) {
			Resultat ="IA Gagne !";
			scoreIA++;
			System.out.println(Resultat);
		}else if(choixJoueur == Choix.CISEAU && choixIA1 == Choix.PIERRE) {
			Resultat ="IA Gagne !";
			scoreIA++;
			System.out.println(Resultat);
		}else if(choixJoueur == Choix.CISEAU && choixIA1 == Choix.FEUILLE) {
			Resultat ="Joueur Gagne !";
			scoreJoueur++;
			System.out.println(Resultat);
		}else if(choixJoueur == Choix.CISEAU && choixIA1 == Choix.CISEAU) {
			Resultat ="égalité !";
			System.out.println(Resultat);
		}
		
		
	}
	
	
	
	
}
