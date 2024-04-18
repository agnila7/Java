package com.loops;

public class WhileNumberPlayer {

	private int playerNmb;

	public WhileNumberPlayer(int playerNmb) {
		// TODO Auto-generated constructor stub
		this.playerNmb = playerNmb;
	}

	public void printSquaresUptoLimit() {
		// TODO Auto-generated method stub
	    for(int i =1; i<= playerNmb; i++) {
				int squareNmb = (i * i);
				if(squareNmb >= 30) {
					break;
				}
				System.out.print(squareNmb + " ");
			}
		}

	public void printCubeUptoLimit() {
		// TODO Auto-generated method stub
		int i =1;
		System.out.println();
				while(i*i*i <= 30) {
					System.out.print(i*i*i + " " );
					i++;
				}
		
	}
		
	}

