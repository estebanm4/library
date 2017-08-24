package taller;

public class LibraryCard {
    private Student owner;
    public int borrowCnt;

    public LibraryCard(Student owner, int borrowCnt) {
        this.owner = owner;
        this.borrowCnt = borrowCnt;
    }

    public Student getOwner() {
        return owner;
    }

    public void setOwner(Student owner) {
        this.owner = owner;
    }

    public double getBorrowCnt() {
        return borrowCnt;
    }

    public void setBorrowCnt(int borrowCnt) {
        this.borrowCnt = borrowCnt;
    }

    @Override
    public String toString() {
        return "LibraryCard{" + "owner=" + owner + ", borrowCnt=" + borrowCnt + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
