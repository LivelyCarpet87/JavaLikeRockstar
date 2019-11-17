import Rockstar.Rockstar;
public class example1 {

	public static void main(String[] args) {
		/*
		 * by https://github.com/meffie
		Put nothing into my heart
		Put nothing into your love
		the spirit was love

		Build your love up
		Put your love into the world
		Love is a long road my friend

		While Love is stronger than nothing
		Put your love over the world into the night
		Put my heart plus the night into my heart
		Build the world up
		Build the world up
		Put your love over the world into the night
		Put my heart minus the night into my heart
		Build the world up
		Build the world up
		Knock Love down

		Put the spirit of my heart into your love
		Shout your love
		
		Loosely translated into Java
		*/
		
		Rockstar Now = new Rockstar(), Please = new Rockstar(), nothing = new Rockstar(0), my_heart = new Rockstar(), 
		the_spirit = new Rockstar(), your_love = new Rockstar() , Love = new Rockstar(), 
		the_world = new Rockstar(),  the_night = new Rockstar();
		
		Now.put(nothing, "into", my_heart);
		Now.put(nothing, "into", your_love);
		the_spirit.was_("love");
		
		Now.build(your_love,"up ");
		Now.put(your_love, "into", the_world);
		Love.is_a("long road my friend");
		
		while(Love.is_stronger_than(nothing)) {
			Please.put(your_love.over(the_world), "into", the_night);
			Please.put(my_heart.plus(the_night), "into", my_heart);
			Now.build(the_world,"up ");
			Now.build(the_world,"up ");
			Please.put(your_love.over(the_world), "into", the_night);
			Please.put(my_heart.minus(the_night), "into", my_heart);
			Now.build(the_world,"up ");
			Now.build(the_world,"up ");
			Now.knock(Love, "down ");
			Now.shout(my_heart);
		}
		
		Please.put(the_spirit._of(my_heart), "into", your_love);
		Now.shout(your_love);

	}

}
