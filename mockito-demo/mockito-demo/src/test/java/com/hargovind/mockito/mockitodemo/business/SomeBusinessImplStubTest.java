package com.hargovind.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SomeBusinessImplStubTest {
	
	@Test
	void findTheGreatestFromAllData_basicScenatio() {
		DataServiceStub dataServiceStub = new DataServiceStub();
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceStub);
		int result = someBusinessImpl.findTheGreatestFromAllData();
		assertEquals(3, result);
	}

}

class DataServiceStub implements DataService{

	@Override
	public int[] retrieveAllData() {
		return new int[]{1,2,3};
	}
	
}