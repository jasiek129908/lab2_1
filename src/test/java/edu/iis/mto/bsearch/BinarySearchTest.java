package edu.iis.mto.bsearch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class BinarySearchTest {

    private SearchResult searchResult;

    @BeforeEach
    void setUp() throws Exception {
    }

    @Test
    void valueIsInSequence() {
        int array[] = {1, 10, 12, 14};
        int searchValue = 10;
        searchResult = BinarySearch.search(searchValue, array);
        assertTrue(searchResult.isFound());
    }

    @Test
    void valueIsNotInSequence() {
        int array[] = {1, 10, 12, 14};
        int searchValue = 19;
        searchResult = BinarySearch.search(searchValue, array);
        assertFalse(searchResult.isFound());
    }

    @Test
    void valueIsFirstElementInArray() {
        int array[] = {1, 10, 12, 14};
        int searchValue = 1;
        searchResult = BinarySearch.search(searchValue, array);
        assertEquals(1, searchResult.getPosition());
    }
    
}
