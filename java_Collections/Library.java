package java_Collections;

public class Library implements Comparable<Library> {
	
	int libNum;
	int totalBooks;
	
	public Library(int libNum, int totalBooks) {
		this.libNum = libNum;
		this.totalBooks = totalBooks;
	}

	@Override
	public int compareTo(Library obj) {
		// TODO Auto-generated method stub
		return this.libNum-obj.libNum;
	}
	
	@Override
	public String toString() {
		
		return this.libNum+ " "+ this.totalBooks;
	}
}
