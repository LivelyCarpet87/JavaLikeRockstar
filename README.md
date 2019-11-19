# JavaLikeRockstar
This package can help you code in Java with style of Rockstar. Become a Java Rockstar Developer.

## What is rockstar?

It is in short a language that reads like power ballads. Rockstar is intended to give the programmer an unprecedented degree of poetic license when it comes to the composition and structure of their programs.

## Background
This project was created as a fun joke to make coding schoolwork harder to read or change. It soon developed into a fun project which helped me pick up my Java skills. I apologize in advance for bad style, redundancy and inefficiency. It deviates from official Rockstar specs to make it more useful or to resolve my incompetence. 

This package creates objects that can store values and can be manipulated like one would in Rockstar. Each object can store separately a float, boolean, array, and String, but it is recommended to use each object to store one type of value. 


# Example script:

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





# Documentation:

For the following documentation, _I_, _Adam_ and _Eve_ are Rockstar objects.

## 1. Floats

### Defining Values: 

>Rockstar Nothing = new Rockstar(0);  
Defines Nothing with float Value 0;

>is_a(String s)    is_the(String s)    was_a(String s) was_the(String s)  

These methods change the float value of the object according to the string input. For example,  

 >Tommy.is_the("boy who cried Wolfram-Alpha")

will change the float value of Tommy to 33353. This package splices the string by spaces and counts the number of characters of each word, special characters included. It then does %10 to the char count and uses it as a digit. 

>is_(float j) is_(int j)  

Sets the float value of object to input. 

>is_(String s) is_(String s)  

We all wanna say something like "Tommy is famous" sometime to make our code more readable. Because of ambiguity, this method does functions of is_a(String s) AND says(String s). Use with caution if a variable stores both a string and a float.

>Adam.listen()  

Reads from console and sets input to value of Sting and float of Adam

>I.put(Adam,"into",Eve)  

Sets float and String of Eve to those of Adam

>I.put(float j,"into",Eve)  

Sets float value of Eve to j

### Manipulating Values:

**Because some words are reserved, "_" were added before**

>Adam.minus(Eve) Adam.without(Eve)  

Returns as float: Adam - Eve

>Adam.plus(Eve) Adam._with(Eve)  

Returns as float: Adam + Eve

>Adam.times(Eve) Adam._of(Eve)  

Returns as float: Adam * Eve

>Adam.over(Eve)  

Returns as float: Adam / Eve

>I.build(Adam, "up, up, and up")  

Adds to Adam: 1 * <amount of times "up" was detected>. Please separate the "up" with **spaces**. Uses .contains("up") after parsing spaces. 

>I.knock(Adam, "downhill again")  

Subtracts from Adam: 1 * <amount of time "down" was detected>. Please separate the "down" with **spaces**. Uses .contains("down") after parsing spaces. 

### Comparing Values
>Eve.is(Adam)  

Returns if Eve==Adam as boolean. **Please note difference from Eve.is_("Adam")**

>Adam.isnt(Eve)  

Returns if Adam != Eve as boolean.

>Adam.is_greater_than(Eve) .is_bigger_than() .is_stronger_than() .is_higher_than()  

Returns if Adam>Eve as boolean. 

>Adam.is_less_than(Eve) .is_smaller_than() .is_weaker_than() .is_lower_than()  

Returns if Adam<Eve as boolean. 

>Adam.is_as_great_as(Eve) .is_as_big_as() .is_as_strong_as() .is_as_high_as() 
 
Returns if Adam>=Eve as boolean. 

>Adam.is_as_little_as(Eve) .is_as_small_as() .is_as_weak_as() .is_as_low_as()  

Returns if Adam<=Eve as boolean. 

### Retrieve Value

>I.whisper(Eve)  

Returns float value of Eve

### Print Value

>I.scream(Eve) I.shout(Eve)  

Prints float value of Eve



## 2. Strings:

### Defining Values
>Adam.listen()  

Reads from console and sets input to value of Sting and float of Adam

>says(String s)

This method changes the stored String value of the object to the string input. 

>is_(String s) is_(String s)  

We all wanna say something like "Tommy is famous" sometime to make our code more readable. Because of ambiguity, this method does functions of is_a(String s) AND says(String s). Use with caution if a variable stores both a string and a float. 

>I.put(Adam,"into",Eve)  

Sets float and String of Eve to those of Adam

### Retrieve Values
Please note as a general rule, the methods that end with "s" deal with strings. 

>Adam.whispers(Eve) Adam.say(Eve)  

Returns the string stored in Eve. 

### Print Values

>Adam.screams(Eve) Adam.shouts(Eve)

Prints String value of Eve


## 3. Booleans:

### Defining Values
> is_(boolean b)  

Sets the boolean value of object to input

>Adam.is_scared_of(Eve)  

Sets boolean value of Adam to that of Eve

> Adam.is_true() the_cake.is_a_lie() the_cakes.are_lies() the_cakes.were_lies() Tommy.is_no("fun")  

Sets the boolean value of the Rockstar object like defined in Rockstar Specs. Above are some special cases. **Most methods** support adding a string input (which is ignored) to make code read better without comments. This is done so if adding a string makes sense.

### Boolean Operators
>Adam.and(boolean b) Adam.and(Eve) Adam.or(boolean b) Adam.or(Eve) Adam.nor(boolean b) Adam.nor(Eve)  

Does the operations with boolean value of Adam and that of inputed object or inputed boolean

> Adam.is_scary_like(Eve)  

Compares the boolean values of Adam and Eve and returns if they are equal

### Retrieving Values
>Adam.said_boo()  

Returns boolean stored in Adam


## 4. Arrays:

### Intro

This is a major derivative from Rockstar Specs as of the writing. Each Rockstar object stores an ArrayList of more Rockstar object. Hopefully, this makes everything make more sense. 

### Adding to array
>Adam.had_a(Rockstar a)  

Appends the inputed Rockstar object to array. 

>Adam.had(float i, Rockstar a)  

Adds the inputed Rockstar object to the slot "i" of ArrayList (Will Replace). **Please note arrays start at 1 due to manipulation in the method.**

### Retrieve 
>Adam.the(3,"rd") Adam.the(3)  

Returns 3rd Rockstar object in array stored in Adam

## 9. Object Manipulation
>put(Rockstar Adam, "into" , Eve)  

Puts Adam's String and float value into Eve. *This may be expanded to boolean and/or arrays in future updates.

> has_left_the_room()  

Calls System.exit(). 

> has_left_the_room("once") has_left_the_room("twice") has_left_the_room("thrice")  

Exits like above method, except customizable exit value. 

# TODO:

1. Add more plurals

2. Support arrays more

3. Stop counting special characters in Float define

# Bugs and Suggestions

Please open an issue if any error is spotted, or if something just doesn't seem to make sense. 

# Contact:

Adam.says("lively")
Eve.says("carpet87")
Boby.says("filler word")
Tommy.is_("at")
Jake.says(gmail)
Who.says("/* the */.com")//bubble is gone

I.whisper(Adam);
I.whisper(Eve);
I.whisper(Tommy);
I.whisper(Jake);
I.whisper(Who);

