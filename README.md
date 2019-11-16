# JavaLikeRockstar
This package can help you code in Java with style of Rockstar. Become a Java Rockstar Developer.

This project was created as a fun joke to make coding schoolwork harder to read or change. It soon developed into a fun project which helped me pick up my Java skills. I apologize in advance for bad style, redundancy and inefficiency. 

This package creates objects that can store values and can be manipulated like one would in Rockstar. Each object can store separately a int and a String, but it is recommended to use each object to store one of the two. 


Example script:

		/*
Example Rockstar Code:

Desire is a lovestruck ladykiller
My world is nothing 
Fire is ice
Hate is water
Until my world is Desire,
Build my world up

Whisper my world
		 */
		
		//The above code can be translated to:
		
		//Pt1:name the rockstars
		Rockstar I = new Rockstar(), nothing = new Rockstar(0), Desire = new Rockstar(), my_world = new Rockstar(), Fire = new Rockstar(), Hate = new Rockstar();
		
		
		//Pt2:rockstar lyrics
		Desire.is_a("lovestruck lady killer");
		my_world.is(nothing);
		Fire.is_("ice");
		Hate.is_("water");
		while(my_world.isnt(Desire)) {
			I.build(my_world, "up");
		}
		
		I.scream(my_world);





Documentation:

For the following documentation, I, Adam and Eve are Rockstar objects.

1. Defining Values

Objects must unfortunately be defined normally in Java. However, methods can be used to modify the value stored:

Integers: 
is_a(String s)    is_the(String s)    was_a(String s) was_the(String s)

These methods change the int value of the object according to the string input. For example,

 Tommy.is_the("boy who cried Wolfram-Alpha") 

will change the int value of Tommy to 3353. This package splices the string by spaces and counts the number of characters of each word, special characters included. It then does %10 to the char count and uses it as a digit. 

String:
says(String s)

This method changes the stored String value of the object to the string input. 

Special:

is_(String s)

We all wanna say something like "Tommy is famous" sometime to make our code more readable. Because of ambiguity, this method does functions of is_a(String s) AND says(String s). Use with caution if a variable stores both a string and a int. 

is_(int j)

Sets the int value of object to input. 

I.put(Adam,"into",Eve)

Sets int and String of Eve to those of Adam

2. Comparisons int

Eve.is(Adam)

Returns if Eve==Adam as boolean. Please note difference from Eve.is_("Adam")

Adam.isnt(Eve)

Returns if Adam != Eve as boolean.

Adam.is_greater_than(Eve) .is_bigger_than() .is_stronger_than() .is_higher_than()

Returns if Adam>Eve as boolean. 

Adam.is_less_than(Eve) .is_smaller_than() .is_weaker_than() .is_lower_than()

Returns if Adam<Eve as boolean. 

Adam.is_as_great_as(Eve) .is_as_big_as() .is_as_strong_as() .is_as_high_as()

Returns if Adam>=Eve as boolean. 

Adam.is_as_little_as(Eve) .is_as_small_as() .is_as_weak_as() .is_as_low_as()

Returns if Adam<=Eve as boolean. 

3. Math

Because some words are reserved, "_" were added

Adam.minus(Eve) Adam.without(Eve)

Returns as int: Adam - Eve

Adam.plus(Eve) Adam._with(Eve)

Returns as int: Adam + Eve

Adam.times(Eve) Adam._of(Eve)

Returns as int: Adam * Eve

Adam.over(Eve)

Returns as int: Adam / Eve

I.build(Adam, "up, up, and up")

Adds to Adam: 1 * <amount of times "up" was detected>. Please separate the "up" with spaces. Uses .contains("up") after parsing spaces. 

I.knock(Adam, "downhill again")

Subtracts from Adam: 1 * <amount of time "down" was detected>. Please separate the "down" with spaces. Uses .contains("down") after parsing spaces. 

4. Get Value

Please note as a general rule, the methods that end with "s" deal with strings. 

I.whisper(Eve)

Returns int value of Eve

Adam.whispers(Eve) Adam.say(Eve)

Returns the string stored in Eve. 

5. println()

I.scream(Eve) I.shout(Eve)

Prints int value of Eve

Adam.screams(Eve) Adam.shouts(Eve)

Prints String value of Eve

6. Scanner

Adam.listen()

Reads .nextln and sets input to value of Sting and int of Adam



TODO:

Add plurals
Add boolean
Change to FLoat


Contact:

Adam.says("lively")
Eve.says("carpet87")
Tommy.is_("at")
Jake.says(gmail)
Who.says("/* the */.com")//bubble is gone



