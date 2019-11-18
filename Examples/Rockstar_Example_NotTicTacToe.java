Import Rockstar;

import java.io.IOException;
//proves that you can make a game in rockstar
public class NotTicTacToe {
//warning, very lax in game rule enforcement. You can take over opponent's tiles. Get the most when all tiles are filled to win

	public static void main(String[] args) throws IOException {
		//name rockstars
		Rockstar Now = new Rockstar(), Please = new Rockstar(), Big_Timmy = new Rockstar(), Little_Timmy = new Rockstar(), Player_One = new Rockstar(), Player_Two = new Rockstar(), Chase = new Rockstar(), Gamer = new Rockstar(), What_I = new Rockstar(), Computery = new Rockstar(), Max = new Rockstar(), Nothing = new Rockstar(0), The_night = new Rockstar(),The_sky = new Rockstar(), Omar = new Rockstar(0), Nobody = new Rockstar(" "), Fifi = new Rockstar(), The_Winner = new Rockstar(" "), Fake = new Rockstar(true);
		Big_Timmy.says("|");
		Little_Timmy.says("-");
		Player_One.says("X");
		Player_One.is_(true);
		Player_Two.says("O");
		Player_Two.is_(true);
		Nobody.is_(false);
		
		Gamer.had_a(Nobody);
		Gamer.had_a(Nobody);
		Gamer.had_a(Nobody);
		Gamer.had_a(Nobody);
		Gamer.had_a(Nobody);
		Gamer.had_a(Nobody);
		Gamer.had_a(Nobody);
		Gamer.had_a(Nobody);
		Gamer.had_a(Nobody);
		
		while(!The_Winner.said_boo()) {
		
		Now.put(What_I.whispers(Gamer.the(1,"st")) + What_I.whispers(Big_Timmy)+What_I.whispers(Gamer.the(2,"nd")) +What_I.whispers(Big_Timmy) + What_I.whispers(Gamer.the(3,"rd")), "into", Chase);
		Please.screams(Chase);
		The_night.is_(" loose");
		Please.put(Nothing, "into", The_sky);
		Please.put(Nothing, "into", Chase);
		while(The_sky.is_as_weak_as(The_night)) {
			Now.put(Now.whispers(Little_Timmy)+Now.whispers(Chase), "into", Chase);
			Now.build(The_sky, "up ");
		}
		Now.screams(Chase);
		
		Now.put(What_I.whispers(Gamer.the(4,"th")) + What_I.whispers(Big_Timmy)+What_I.whispers(Gamer.the(5,"th")) +What_I.whispers(Big_Timmy) + What_I.whispers(Gamer.the(6,"th")), "into", Chase);
		Please.screams(Chase);
		The_night.is_(" loose");
		Please.put(Nothing, "into", The_sky);
		Please.put(Nothing, "into", Chase);
		while(The_sky.is_as_weak_as(The_night)) {
			Now.put(Now.whispers(Little_Timmy)+Now.whispers(Chase), "into", Chase);
			Now.build(The_sky, "up ");
		}
		Now.screams(Chase);
		
		Now.put(What_I.whispers(Gamer.the(7,"th")) + What_I.whispers(Big_Timmy)+What_I.whispers(Gamer.the(8,"th")) +What_I.whispers(Big_Timmy) + What_I.whispers(Gamer.the(9,"th")), "into", Chase);		Please.screams(Chase);
		
		Computery.is_(1);
		Max.is_(9);
		Computery.listen();
		if (Computery.is(Max)) {
			The_Winner.is_(true);
		}
		while(Computery.is_stronger_than(Max)) {
		while(Computery.is_stronger_than(Max)) {
			Computery.says("Bad Input. My disapointment is immeasurable and my day is ruined. ");
			Please.shouts(Computery);
			Computery.is_(1);
			Computery.listen();
		}
		while (Gamer.the(Please.whisper(Computery)).is(Nobody)) {
			Computery.says("Bad Input. My disapointment is immeasurable and my day is ruined. ");
			Please.shouts(Computery);
			Computery.is_(1);
			Computery.listen();
		}
		}
		
		Gamer.had(Please.whisper(Computery), Player_One);
		
		
		
		Computery.is_(2);
		Max.is_(9);
		Computery.listen();
		if (Computery.is(Max)) {
			The_Winner.is_(true);
		}
		while(Computery.is_stronger_than(Max)) {
			while(Computery.is_weaker_than(Omar)) {
				Computery.says("Bad Input. My disapointment is immeasurable and my day is ruined. ");
				Please.shouts(Computery);
				Computery.is_(1);
				Computery.listen();
			}
		while(Computery.is_stronger_than(Max)) {
			Computery.says("Bad Input. My disapointment is immeasurable and my day is ruined. ");
			Please.shouts(Computery);
			Computery.is_(1);
			Computery.listen();
		}
		while (Gamer.the(Please.whisper(Computery)).isnt(Nobody)) {
			Computery.says("Bad Input. My disapointment is immeasurable and my day is ruined. ");
			Please.shouts(Computery);
			Computery.is_(1);
			Computery.listen();
		}
		}
		
		Gamer.had(Please.whisper(Computery), Player_Two);
		
		Now.put(Nothing, "into", Fifi);
		
		for(int i = 1; i <= 9; i++) {
			if(Gamer.the(i).said_boo() == Fake.said_boo()) {
				Now.build(Fifi, " up ");
				
			}
		}
		
		if (Fifi.is(Max)) {
		Computery.says("Game Over, player with most marks win. ");
		Please.shouts(Computery);
		}
		
		}
	}
}


