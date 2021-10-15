package com.bu.cs.component.cardgame.blackJack;

import com.bu.cs.component.cardgame.Dealer;
import com.bu.cs.component.cardgame.card.Card;
import com.bu.cs.component.cardgame.card.CardValue;
import com.bu.cs.component.cardgame.card.Hand;

import java.util.ArrayList;
import java.util.List;

public class BlackjackDealer extends Dealer{
	private int minValue = 17;

	public int getMinValue() {
		return minValue;
	}

	public  boolean isNaturalBlackJack(int handIndex, int winCondition){
		Hand hand = this.getHands().get(handIndex);
		List<CardValue> cardValues = new ArrayList<>();
		if(hand.currentHand() == winCondition && hand.getCards().size() == 2) {
			for(Card card: hand.getCards()) {
				cardValues.add(card.getCardValue());
			}
			if(cardValues.contains(CardValue.ACE) && (cardValues.contains(CardValue.KING) || cardValues.contains(CardValue.QUEEN) || cardValues.contains(CardValue.JACK))) {
				return true;
			}
		}
		return false;
	}

}
