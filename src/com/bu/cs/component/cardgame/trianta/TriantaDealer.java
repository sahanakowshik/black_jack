package com.bu.cs.component.cardgame.trianta;

import com.bu.cs.component.cardgame.Dealer;

public class TriantaDealer extends Dealer{
	private int minvalue = 27;
	private boolean isBust = false;

	/**
	 * Get the min value
	 * @return
	 */
	public int getMinvalue() {
		return minvalue;
	}

	/**
	 * Check if bust
	 * @return
	 */
	public boolean isBust() {
		return isBust;
	}

	/**
	 * Set the bust value
	 * @param isBust
	 */
	public void setBust(boolean isBust) {
		this.isBust = isBust;
	}
}
