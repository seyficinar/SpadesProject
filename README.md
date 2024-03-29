# SpadesProject
Basic Card Game
Card game (Batak in Turkish) with spesific rules without user interface in Java language. Rules as follows: 
SPADES

Project Description:
Spades is a trick-taking card game invented in the 1930s in the United States. It may be played
as a team game or as a solo/"cutthroat" game. The goal is to take the number of tricks (also
known as "books") that were bid before to the start of the hand.
In this project you are asked to implement this game as a solo/single-player game variant. So
the real player will play against 3 different computers/pseudo-players. Below you can find the
rules and the game playing of the Spades.
● Number of Players: 4
● The Deck: Standard 52-card deck.
● Rank of Suit: The trump suit is always Spades. Other suits have no intrinsic value
during play, however a card of the present suit will defeat a card of any other suit except
a Spade.
● Rank of Cards: Highest to lowest: Ace, King, Queen, Jack, 10, 9, 8, 7, 6, 5, 4, 3, 2
● Goal: To be the first player to reach 500 points. Points are earned by taking at least the
number of tricks bid in each hand and are lost for failing to take at least that many or, in
rare situations, taking too many.
● Setup: Players sit across from each other at the table. A dealer amongst the players is
picked to shuffle the deck and deal 13 cards to each player.
● Bidding:The player on the dealer's left places the initial bid. Each player checks his
cards and bids, indicating the amount of tricks he believes he has. For each player, any
number from 0 ("Nil") to 13 is a legal offer. Passing may not be permitted. Bids do not
have to rise with each additional player. There is just one bidding round.
Let’s say David is the dealer and Alex is on the left of David. First Alex offers 4. Then
Beth bids 3, Charlie offers 2, and finally David bids 2.
○ Nil Bidding: When a player bids Nil (zero), he declares that he will not win any
tricks during the hand. If he succeeds, he receives a 100-point bonus. If he wins
one or more tricks, he will be penalized 100 points.
● Gameplay:
○ The player on the dealer's left takes the first turn ("leads"). He may not lead with
a spade unless his hand only includes spades. In fact, unless a player is forced
1
to do so, spades may never be led until the suit is "broken" (see Breaking
Spades section).
○ The game proceeds clockwise. If possible, each player must follow suit (play the
same suit that was led).
○ In general, the player who played the highest rank of the current suit wins the
trick. If one or more players played spades, the person with the highest rank of
spades wins the trick.
● Breaking Spades:
○ When a player cannot follow suit and decides to play a spade, the game is
broken. When a player is unable to follow suit, he may choose to play spades but
is not compelled to do so.
○ Note: Spades are also broken if a player has no choice but to lead with spades.
Example: Alex leads with his heart. Beth and Charlie both play hearts as well. David
doesn't have any hearts, so he may play spades instead. David, on the other hand, may
choose to play clubs or diamonds.
● Scoring:
○ After a hand is finished, the players calculate the number of tricks they took.
○ The trick count of each player is then compared to their bid.
○ If the player made at least the number of tricks bid, 10 points for each bid trick
are awarded (a bid of 5 would earn 50 points if made).
○ If a player fails to meet its contract, it is "set," and 10 points are subtracted from
the player's score for each bid trick (e.g.: six bids and any number less than six
taken results in minus 60 points).
○ Whenever a player takes more tricks than they bid, a single point is awarded for
each overtrick, often known as a "bag" or "sandbag" (a bid of 5 tricks with 6
tricks taken results in a score of 51 points)
● Winning: First player reaching the score of 500 wins the game.
