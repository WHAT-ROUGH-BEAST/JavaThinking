package chapter3;

import java.util.*;

/**
 * to mark how to use finalize to check
 * if correctly gc
 * @author jiang
 */
class test{
    public static void main(String args[]){
        Book novel = new Book(true);
        novel.checkIn();

        new Book(true);
        System.gc();
    }
}

/**
 * Book
 * with finalize to throw error if wrongly gc a book
 */
class Book{
    static int N = 0;
    private int no;
    private boolean CheckedOut;

    public Book(boolean check){
        CheckedOut = check;
        no = N;
        N++;
    }

    public void checkIn(){
        CheckedOut = false;
    }

    /**
     * a book must be checkedin before gc
     */
    protected void finalize(){
        if(CheckedOut){
            System.out.println("error: book" + no + " not checkin");
        }
    }
}