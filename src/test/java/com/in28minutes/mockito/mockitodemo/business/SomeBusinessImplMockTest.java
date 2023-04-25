package com.in28minutes.mockito.mockitodemo.business;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {

    @Mock
    private DataService dataServiceMock;

    @InjectMocks
    private SomeBusinessImpl someBusiness;
    @Test
    void findTheGreatest_basic(){
        //        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {35,25,1});
        //        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceMock);
        int result = someBusiness.findTheGreatest();
        assertEquals(35,result);
    }

    @Test
    void findTheGreatest_OneValue(){
//        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {2});
//        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceMock);
        int result = someBusiness.findTheGreatest();
        assertEquals(2,result);
    }

    @Test
    void findTheGreatest_EmptyArray(){
//        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
//        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceMock);
        int result = someBusiness.findTheGreatest();
        assertEquals(Integer.MIN_VALUE,result);
    }

}