package byx.web.bookstore.pojo.vo;

public class FavoriteVO {
    private Integer bookId;
    private String bookName;
    private String bookAuthor;
    private String bookDescription;
    private String time;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getBookCover() {
        return "http://182.92.74.74:8888/byx-bookstore-api/upload/cover/" + bookId + ".jpg";
    }
}
