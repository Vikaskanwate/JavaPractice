public class LibrarySystem {

    private String libraryName;
    private int totalBooks;
    private int issuedBooks;
    private double finePerDay;

    public LibrarySystem(String libraryName, int totalBooks, double finePerDay) {
        this.libraryName = libraryName;
        this.totalBooks = totalBooks;
        this.finePerDay = finePerDay;
        this.issuedBooks = 0;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public int getTotalBooks() {
        return totalBooks;
    }

    public void setTotalBooks(int totalBooks) {
        if(totalBooks < 0) {
            System.out.println("enter positive count");
            return;
        } 
        this.totalBooks = totalBooks;
    }

    public int getIssuedBooks() {
        return issuedBooks;
    }

    public void setIssuedBooks(int issuedBooks) {
        if(issuedBooks < 0) {
            System.out.println("enter positive count");
            return;
        } 
        this.issuedBooks = issuedBooks;
    }

    public double getFinePerDay() {
        return finePerDay;
    }

    public void setFinePerDay(double finePerDay) {
        if(finePerDay < 0) {
            System.out.println("enter positive count");
            return;
        }
        this.finePerDay = finePerDay;
    }

    // TODO 1: Issue Books
    // If issuing exceeds totalBooks → set issuedBooks = totalBooks
    // Otherwise increase issuedBooks by count
    public void issueBooks(int count) {
        if(count < 0) {
            System.out.println("enter positive count");
            return;
        } 
        int newIssued = count + totalBooks;
        if (newIssued > totalBooks) {
            setIssuedBooks(newIssued);
        } else {
            totalBooks += newIssued;
        }
    }

    // TODO 2: Return Books
    // If returning makes issuedBooks < 0 → set to 0
    // Otherwise subtract count
    public void returnBooks(int count) {
        if(count < 0) {
            System.out.println("enter positive count");
            return;
        } 
        if (count > issuedBooks) {
            setIssuedBooks(0);
        } else {
            setIssuedBooks(issuedBooks-count);;
        }
    }

    // TODO 3: Update Fine
    // Update only if newFine > 0
    public void updateFine(double newFine) {
        if (newFine > 0) {
            setFinePerDay(newFine);
        }
    }

    // TODO 4: Calculate Total Fine
    // Formula: issuedBooks * finePerDay * days
    public double calculateFine(int days) {
        return getIssuedBooks() * finePerDay * days;
    }

    // TODO 5: Available Books
    // totalBooks - issuedBooks
    public int getAvailableBooks() {
        return totalBooks - issuedBooks;
    }

    // TODO 6: Summary
    // Format:
    // LibraryName - Issued: X/Y, Fine per day: Z
    public String getSummary() {
        return getLibraryName() + " - Issued: " + issuedBooks + "/" +  totalBooks +", Fine per day: " + getFinePerDay();
    }

    public static void main(String[] args) {

        // Create object
        LibrarySystem lib = new LibrarySystem("City Library", 100, 5.0);

        // Test issueBooks
        lib.issueBooks(30);
        System.out.println("Issued 30 " + lib.getSummary());

        // Test overflow (should cap at totalBooks)
        lib.issueBooks(80);
        System.out.println("Issued 80 more " + lib.getSummary());

        // Test returnBooks
        lib.returnBooks(20);
        System.out.println("Returned 20 " + lib.getSummary());

        // Test underflow (should not go below 0)
        lib.returnBooks(200);
        System.out.println("Returned 200 " + lib.getSummary());

        // Test fine update
        lib.updateFine(10);
        System.out.println("Updated Fine " + lib.getSummary());

        // Test calculateFine
        double fine = lib.calculateFine(3);
        System.out.println("Fine for 3 days: " + fine);

        // Test available books
        System.out.println("Available Books: " + lib.getAvailableBooks());
    }
}
