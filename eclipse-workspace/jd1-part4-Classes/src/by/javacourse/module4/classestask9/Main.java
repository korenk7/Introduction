package by.javacourse.module4.classestask9;

public class Main {
	static Books books = new Books();

	public static void main(String[] args) {

		
		Book book2 = new Book("Winney Pooh", "Alan Mill", "Esperansa", 1970, 315, 1800, "hard");
		Book book3 = new Book("Piter Pen", "Andersen", "HoolandPublic", 1933, 34, 190, "soft");
		Book book4 = new Book("Far away to arms", "Hemingway", "cantsay", 1955, 315, 2600, "hard");
		Book book5 = new Book("Quo vadis", "Senkewicz", "Asweta", 1948, 233, 1600, "soft");
		Book book6 = new Book("Java Book", "Shildt", "Esperansa", 1948, 233, 1600, "soft");


		books.pushNewBook(book2);
		books.pushNewBook(book3);
		books.pushNewBook(book4);
		books.pushNewBook(book5);
		books.pushNewBook(book6);
		
		books.printBooks();
		System.out.println();
		books.findBookByAuthor("Hemingway");
		
		System.out.println();
		books.findBookByPublishingHouse("Esperansa");
		
		System.out.println();
		books.findBookPublicAfter(2011);
		System.out.println();
		books.findBookPublicAfter(1948);
	}

}
