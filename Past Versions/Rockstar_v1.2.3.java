package Rockstar;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Rockstar extends ArrayList {
	float value = 0; //rockstar float variables
	String txt = ""; //rockstar string variables
	ArrayList<Rockstar> array = new ArrayList<Rockstar>();
	Boolean boo = false;
	

	public Rockstar(){
		
	}
	public Rockstar(int i) {
		value = i;
	}
	public Rockstar(float i){
		value = i;
	}
	
	public Rockstar(String str){
		txt = str;
	}
	//rockstar int define

	public Rockstar(boolean b) {
		boo = b;
	}
	public void put(Rockstar a, String into, Rockstar b) {
		b.set(a.get());
		b.says(a.gets());
	}
	
	public void put(float a, String into, Rockstar b) {
		b.set(a);
	}
	
	public void put(String a, String into, Rockstar b) {
		b.says(a);
	}

	public void set(float f) {
		value = f;
	}

	public void is_(String description) {
		String delims = "[ ]+";
		String[] tokens = description.split(delims);
		int j = 0;
		int charcount = 0;
		for (int i = tokens.length - 1; i >= 0; i = i - 1) {
			charcount = charcount + (int) (((tokens[i].length()) % 10) * Math.pow(10, j));
			j++;
		}
		value = charcount;
	}
	
	public void was_(String description) {
		String delims = "[ ]+";
		String[] tokens = description.split(delims);
		int j = 0;
		int charcount = 0;
		for (int i = tokens.length - 1; i >= 0; i = i - 1) {
			charcount = charcount + (int) (((tokens[i].length()) % 10) * Math.pow(10, j));
			j++;
		}
		value = charcount;
	}
	
	public void is_(int j) {
		
		value = j;
	}
	
	public void was_(int j) {
		
		value = j;
	}
	
	public void is_(float j) {
		
		value = j;
		}
	
	public void was_(float j) {
		
		value = j;
		}
	
	public void is_(boolean j) {
	
		boo = j;
	}
	
	public void was_(boolean j) {
		
		boo = j;
	}

	//boolean
		
	//more setting values
	public void is_scared_of(Rockstar b) {
		boo = b.said_boo();
	}
	
	//get value

	public boolean said_boo() {
		return boo;
	}
	
	//logical operators
	public boolean getboo() {
		return boo;
	}
	
	public boolean and(Rockstar b){
		return boo&&b.getboo();
	}
	
	public boolean and(boolean b){
		return boo&&b;
	}
	
	public boolean or(Rockstar b){
		return boo|b.getboo();
	}
	
	public boolean or(boolean b){
		return boo|b;
	}
	
	public boolean nor(Rockstar b){
		return !boo|!b.getboo();
	}
	
	public boolean nor(boolean b){
		return !boo|!b;
	}
	
	
	//false
	public void is_false() {
		boo = false;
	}
	
	public void is_false(String s) {
		boo = false;
	}
	
	public void is_wrong() {
		boo = false;
	}
	
	public void is_wrong(String s) {
		boo = false;
	}
	
	public void is_no() {
		boo= false;
	}
	
	public void is_no(String s) {
		boo= false;
	}
	
	public void are_lies() {
		boo = false;
	}
	
	public void is_a_lie() {
		boo = false;
	}
	
	public void was_false() {
		boo = false;
	}
	
	public void was_false(String s) {
		boo = false;
	}
	
	public void was_wrong() {
		boo = false;
	}
	
	public void was_wrong(String s) {
		boo = false;
	}
	
	public void were_lies() {
		boo = false;
	}
	
	public void was_a_lie() {
		boo = false;
	}
	public void was_no(String s) {
		boo = false;
	}
	//True
	public void is_true() {
		boo = true;
	}
	
	public void is_true(String s) {
		boo = true;
	}
	
	public void is_right() {
		boo = true;
	}
	
	public void is_right(String s) {
		boo = true;
	}
	
	public void is_ok() {
		boo = true;
	}
	
	public void is_ok(String s) {
		boo = true;
	}
	
	public void is_yes() {
		boo = true;
	}
	public void is_yes(String s) {
		boo = true;
	}
	
	public void was_true() {
		boo = true;
	}
	
	public void was_true(String s) {
		boo = true;
	}
	
	public void was_right() {
		boo = true;
	}
	
	public void was_right(String s) {
		boo = true;
	}
	
	public void was_ok() {
		boo = true;
	}
	
	public void was_ok(String s) {
		boo = true;
	}
	
	public void was_yes(String s) {
		boo = true;
	}
	
	//arrays
	//retrieve
	public Rockstar the(int i,String s) {
		return array.get(i-1);
	}
	
	public Rockstar the(float f) {
		return array.get(((int)f-1));
	}
	//add objects
	public void had(float f, Rockstar a) {
		array.add(((int)(f-1)),a);
	}
	
	public void had_a(Rockstar a) {
		array.add(a);
	}
	
	public void is_a(String description) {
		String delims = "[ ]+";
		String[] tokens = description.split(delims);
		int j = 0;
		int charcount = 0;
		for (int i = tokens.length - 1; i >= 0; i = i - 1) {
			
			charcount = charcount + (int) (((tokens[i].length()) % 10) * Math.pow(10, j));
			
			j++;
			
		}
		value = (float) (charcount + 1 * Math.pow(10, j));
	}
	
	public void set_as_string(String description) {
		String delims = "[ ]+";
		String[] tokens = description.split(delims);
		int j = 0;
		int charcount = 0;
		for (int i = tokens.length - 1; i >= 0; i = i - 1) {
			
			charcount = charcount + (int) (((tokens[i].length()) % 10) * Math.pow(10, j));
			
			j++;
			
		}
		value = (float) (charcount);
	}
	
	public void is_the(String description) {
		String delims = "[ ]+";
		String[] tokens = description.split(delims);
		int j = 0;
		int charcount = 0;
		for (int i = tokens.length - 1; i >= 0; i = i - 1) {
			charcount = charcount + (int) (((tokens[i].length()) % 10) * Math.pow(10, j));
			j++;
		}
		value = (float) (charcount + 3 * Math.pow(10, j));;
	}

	public void was_a(String description) {
		String delims = "[ ]+";
		String[] tokens = description.split(delims);
		int j = 0;
		int charcount = 0;
		for (int i = tokens.length - 1; i >= 0; i = i - 1) {
			charcount = charcount + (int) (((tokens[i].length()) % 10) * Math.pow(10, j));
			j++;
		}
		value = (float) (charcount + 1 * Math.pow(10, j));;
	}
	public void was_the(String description) {
		String delims = "[ ]+";
		String[] tokens = description.split(delims);
		int j = 0;
		int charcount = 0;
		for (int i = tokens.length - 1; i >= 0; i = i - 1) {
			charcount = charcount + (int) (((tokens[i].length()) % 10) * Math.pow(10, j));
			j++;
		}
		value = (float) (charcount + 3 * Math.pow(10, j));;
	}

	//increment & decrement

	public static int count(String in , String key) {
		String temp[] = in .split(" ");
		int count = 0;
		for (int i = 0; i < temp.length; i++) {
			if (temp[i].contains(key))
				count++;
		}
		return count;
	}

	public void build(Rockstar a, String s) {
		int add = count(s,"up");
		a.set(a.get() + add);
	}
	public void knock(Rockstar a, String s) {
		int less = count(s,"down");
		a.set(a.get() - less);
	}

	//rockstar arithmetic 
	public float without(Rockstar b) {
		return value - b.get();
		
	}

	public float minus(Rockstar b) {
		return value - b.get();
		
	}
	public float plus(Rockstar b) {
		return value + b.get();
	}
	public float _with(Rockstar b) {
		return value + b.get();
	}
	public float times(Rockstar b) {
		return ((int)value * b.get());
	}
	public float _of(Rockstar b) {
		return value * b.get();
	}
	public float over(Rockstar b) {
		return (value / b.get());
	}

	//comparison but no value change
	//to manipulate int, use put()
	//to manipulate string, use says()
	public boolean is(Rockstar b) {

		if (value == b.get()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isnt(Rockstar b) {

		if (value != b.get()) {
			return true;
		} else {
			return false;
		}
	}


	//comparisons > <
	public boolean is_greater_than(Rockstar b) {
		if (value > b.get()) {
			return true;
		} else {
			return false;
		}
	}
	public boolean is_higher_than(Rockstar b) {
		if (value > b.get()) {
			return true;
		} else {
			return false;
		}
	}
	public boolean is_bigger_than(Rockstar b) {
		if (value > b.get()) {
			return true;
		} else {
			return false;
		}
	}
	public boolean is_stronger_than(Rockstar b) {
		if (value > b.get()) {
			return true;
		} else {
			return false;
		}
	}
	public boolean is_weaker_than(Rockstar b) {
		if (value < b.get()) {
			return true;
		} else {
			return false;
		}
	}
	public boolean is_smaller_than(Rockstar b) {
		if (value < b.get()) {
			return true;
		} else {
			return false;
		}
	}
	public boolean is_lower_than(Rockstar b) {
		if (value < b.get()) {
			return true;
		} else {
			return false;
		}
	}
	public boolean is_less_than(Rockstar b) {
		if (value < b.get()) {
			return true;
		} else {
			return false;
		}
	}

	//comparisons >= <=
	public boolean is_as_great_as(Rockstar b) {
		if (value >= b.get()) {
			return true;
		} else {
			return false;
		}
	}
	public boolean is_as_high_as(Rockstar b) {
		if (value >= b.get()) {
			return true;
		} else {
			return false;
		}
	}
	public boolean is_as_big_as(Rockstar b) {
		if (value >= b.get()) {
			return true;
		} else {
			return false;
		}
	}
	public boolean is_as_strong_as(Rockstar b) {
		if (value >= b.get()) {
			return true;
		} else {
			return false;
		}
	}
	public boolean is_as_weak_as(Rockstar b) {
		if (value <= b.get()) {
			return true;
		} else {
			return false;
		}
	}
	public boolean is_as_small_as(Rockstar b) {
		if (value <= b.get()) {
			return true;
		} else {
			return false;
		}
	}
	public boolean is_as_low_as(Rockstar b) {
		if (value <= b.get()) {
			return true;
		} else {
			return false;
		}
	}
	public boolean is_as_little_as(Rockstar b) {
		if (value <= b.get()) {
			return true;
		} else {
			return false;
		}
	}

	//get values, deviation from rockstar specs, hopefully helps 
	public float get() {
		return value;
	}


	//print value


	//treating rockstar strings

	//input
	public void says(String s) {
		txt = s;
	}

	//output values
    //get values
	public String gets() {
		return txt;
	}

	public String whispers(Rockstar a) {
		return a.gets();
	}

	public String say(Rockstar a) {
		return a.gets();
	}

	//print values
	public void shouts(Rockstar a) {
		System.out.println(a.gets());
	}

	public void screams(Rockstar a) {
		System.out.println(a.gets());
	}
	
    //get values
	public float whisper(Rockstar a) {
		return a.get();
	}

	//print values
	public void shout(Rockstar a) {
		System.out.println(a.get());
	}

	public void scream(Rockstar a) {
		System.out.println(a.get());
	}

	//listen
	public void listen() {
//		Scanner in = new Scanner(System.in);
//		txt = in .nextLine();
//		in.close();
		BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
     try {
		txt = reader.readLine();
	} catch (IOException e) {
		System.out.println("read fail");
		//e.printStackTrace();
	}
		
		this.set_as_string(txt);
	}

	


}