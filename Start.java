package proekt17;

import java.util.Arrays;
import java.util.ArrayList;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library library = new Library();
		library.name = "Karasuno Library";
		
		Author tsukki = new Author();
		tsukki.name = "Kei Tsukishima";
		Author yamaguchi = new Author();
		yamaguchi.name = "Tadashi Yamaguchi";
		Author suga = new Author();
		suga.name = "Koshi Sugawara";
		
		Book book1 = new Book();
		book1.author = tsukki;
		book1.ISBN = "123654789";
		Book book2 = new Book();
		book2.author = yamaguchi;
		book2.ISBN = "987456321";
		Book book3 = new Book();
		book3.author = suga;
		book3.ISBN = "963258741";
		
		tsukki.books = new ArrayList<Book>(Arrays.asList(book1));
		yamaguchi.books = new ArrayList<Book>(Arrays.asList(book2));

		library.books = new ArrayList<Book>(Arrays.asList(book1, book2, book3));
		
		System.out.println("Collection of: " + library.name);
		for(Book book : library.books) {
			System.out.println(book.ISBN + " " + book.author.name);
		}

	}

}
