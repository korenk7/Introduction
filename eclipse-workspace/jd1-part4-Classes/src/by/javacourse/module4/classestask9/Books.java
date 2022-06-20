package by.javacourse.module4.classestask9;

public class Books {

	Book[] books;
	int size;
	int capacity;
	Book[] temp;
	int countOfBooks;

	public Books() {
		size = 0;
		capacity = 1;
		books = new Book[1];
	}

	public void pushNewBook(Book book) {
		if (size < capacity) {
			books[size] = book;
			size++;
		} else {
			temp = new Book[capacity];
			temp = books;
			capacity = capacity * 2;
			books = new Book[capacity];
			for (int i = 0; i < size; i++) {
				books[i] = temp[i];
			}
			books[size] = book;
			size++;
		}

	}

	public void findBookByAuthor(String authorName) {

		for (int i = 0; i < size; i++) {
			if (books[i].getAuthorName().equals(authorName)) {
				System.out.println(books[i].toString());
			}
		}
	}

	public void findBookByPublishingHouse(String publishingHouse) {

		for (int i = 0; i < size; i++) {
			if (books[i].getPublishingHouse().equals(publishingHouse)) {
				System.out.println(books[i].toString());
			}
		}
	}

	public void findBookPublicAfter(int year) {
		
		for (int i = 0; i < size; i++) {
			if (books[i].getYearOfPublishing() > year) {
				System.out.println(books[i].toString());
				countOfBooks++;
			} 	
		}
		if(countOfBooks == 0) {
			System.out.println("There is no books with this parametrs");
		} 
		countOfBooks=0;
	}

	public void printBooks() {

		for (int i = 0; i < size; i++) {
			System.out.println(books[i].toString());
		}

	}

}
