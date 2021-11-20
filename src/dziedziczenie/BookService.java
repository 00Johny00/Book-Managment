package dziedziczenie;

public class BookService {
    public Book[] filterBooksByAuthor(Author author, Book[] books){
        if (author == null || books == null) {
            return new Book[0];
        }
        int matchAmount = 0;
        for (Book book: books) {
            if(book.hasAuthor(author))
                matchAmount++;
        }
        Book[] filterBooksByAuthor = new Book[matchAmount];
        int index = 0;
        for (Book book: books) {
            if(book.hasAuthor(author))
                filterBooksByAuthor[index++] = book;
        }

        return filterBooksByAuthor;

    }

    public Book[] filterBooksByPublisher(Publisher publisher, Book[] books){
        if (publisher == null || books == null) {
            return new Book[0];
        }

        int matchAmount = 0;
        for (Book book: books) {
            if(book.getPublisher().equals(publisher))
                matchAmount++;
        }
        Book[] filterBooksByPublisher = new Book[matchAmount];
        int index = 0;
        for (Book book: books) {
            if(book.getPublisher().equals(publisher))
                filterBooksByPublisher[index++] = book;
        }
        return filterBooksByPublisher;
    }

    public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusivley, Book[] books){
        if (books == null) {
            return new Book[0];
        }
        int matchAmount = 0;
        for (Book book: books) {
            if(book.getPublishingYear() >= yearFromInclusivley)
                matchAmount++;
        }
        Book[] filterBooksAfterSpecifiedYear = new Book[matchAmount];
        int index = 0;
        for (Book book: books) {
            if(book.getPublishingYear() >= yearFromInclusivley)
                filterBooksAfterSpecifiedYear[index++] = book;
        }
        return filterBooksAfterSpecifiedYear;
    }
}
