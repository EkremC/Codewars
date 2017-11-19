package _5KYU;

// https://www.codewars.com/kata/paginationhelper/train/java

import java.util.List;

public class PaginationHelper<I> {
    private List<I> list;
    private final int itemsPerPage;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        list = collection;
        this.itemsPerPage = itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return list.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        int pageCount = 0;
        int listSize = list.size();
        pageCount = listSize / itemsPerPage;
        if (listSize % itemsPerPage != 0)
            pageCount++;
        return pageCount;
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        int pageNumber = pageCount();
        if (pageIndex + 1 > pageNumber)
            return -1;
        if ((pageIndex + 1) == pageNumber)
            return itemCount() % itemsPerPage;
        else if ((pageIndex + 1) * 4 < itemCount())
            return itemsPerPage;
        return itemsPerPage;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        int itemNumber = itemCount();
        if (itemIndex > itemNumber || itemIndex < 0)
            return -1;
        int itemDivider = itemIndex / itemsPerPage;
        if (itemDivider < 0)
            return 0;
        else {
            return itemDivider;
        }
    }
}
/*
PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
helper.pageCount(); //should == 2
helper.itemCount(); //should == 6
helper.pageItemCount(0); //should == 4
helper.pageItemCount(1); // last page - should == 2
helper.pageItemCount(2); // should == -1 since the page is invalid

// pageIndex takes an item index and returns the page that it belongs on
helper.pageIndex(5); //should == 1 (zero based index)
helper.pageIndex(2); //should == 0
helper.pageIndex(20); //should == -1
helper.pageIndex(-10); //should == -1
 */