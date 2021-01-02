package proekt17;

import java.util.ArrayList;
import java.util.Arrays;

public class Book {
	String ISBN;
	Author author;
	ArrayList<Chapter> chapters;
	
	Book(){
		chapters = new ArrayList<Chapter>(Arrays.asList(
				new Chapter(1),
				new Chapter(2),
				new Chapter(3)));

	}
}
