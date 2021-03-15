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
        int array[] = {1};
        int searchValue = 1;
        searchResult = BinarySearch.search(searchValue, array);
        assertTrue(searchResult.isFound());
    }

    @Test
    void valueIsNotInSequence() {
        int array[] = {12};
        int searchValue = 19;
        searchResult = BinarySearch.search(searchValue, array);
        assertFalse(searchResult.isFound());
    }

    @Test
    void valueIsFirstElementInSequence() {
        int array[] = {1, 10, 12, 14};
        int searchValue = 1;
        searchResult = BinarySearch.search(searchValue, array);
        assertEquals(1, searchResult.getPosition());
    }

    @Test
    void valueIsLastElementInSequence() {
        int array[] = {1, 10, 12, 14};
        int searchValue = 14;
        searchResult = BinarySearch.search(searchValue, array);
        assertEquals(array.length, searchResult.getPosition());
    }

    @Test
    void valueIsCentralElementInSequence() {
        int array[] = {1, 10, 12};
        int searchValue = 10;
        searchResult = BinarySearch.search(searchValue, array);
        assertEquals((array.length / 2) + 1, searchResult.getPosition());
    }

    @Test
    void valueIsNotInSequenceOfMultipleSize() {
        int array[] = {12, 14, 20};
        int searchValue = 19;
        searchResult = BinarySearch.search(searchValue, array);
        assertFalse(searchResult.isFound());
    }
}
