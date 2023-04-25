package com.in28minutes.mockito.mockitodemo.list;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    void test() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(3);
        assertEquals(3,listMock.size());
    }

    @Test
    void test1() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(3).thenReturn(2);
        assertEquals(3,listMock.size());
        assertEquals(2,listMock.size());
        assertEquals(2,listMock.size());
        assertEquals(2,listMock.size());
        assertEquals(2,listMock.size());
    }

    @Test
    void test2() {
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("some_value");
        assertEquals("some_value",listMock.get(0));
        assertEquals(null,listMock.get(1));
    }

    @Test
    void test3() {
        List listMock = mock(List.class);
        when(listMock.get(Mockito.anyInt())).thenReturn("some_value").thenReturn("test");
        assertEquals("some_value",listMock.get(0));
        assertEquals("test",listMock.get(1));
    }
}
