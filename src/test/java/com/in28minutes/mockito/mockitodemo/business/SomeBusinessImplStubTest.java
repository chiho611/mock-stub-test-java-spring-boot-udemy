package com.in28minutes.mockito.mockitodemo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeBusinessImplStubTest {

    @Test
    void findTheGreatest_basic(){
        DataService dataService = new DataServiceStub();
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataService);
        int result = someBusiness.findTheGreatest();
        assertEquals(35,result);
    }

    @Test
    void findTheGreatest_withOneValue(){
        DataService dataService = new DataServiceStub1();
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataService);
        int result = someBusiness.findTheGreatest();
        assertEquals(2,result);
    }

}

class DataServiceStub implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[] {35,25,1};
    }
}

class DataServiceStub1 implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[] {2};
    }
}