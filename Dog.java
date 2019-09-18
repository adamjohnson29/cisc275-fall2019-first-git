import java.io.*;
import java.util.*;

public class Dog extends Animal {
	public Dog(String name, int numLegs) {
		this.name = name;
		this.numLegs = numLegs;
	}
	
	public String toString() {
		String tostring;
		tostring = this.name + ", " + Integer.toString(numLegs);
		return tostring;
	}
}