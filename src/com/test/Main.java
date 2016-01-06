package com.test;

public class Main {
	//测试，test，t  
	DistributedLock lock = null;
 
	public static void main(String[] args) {
		new Main().test();
	}

	private void test() {
		try {
			lock = new DistributedLock("127.0.0.1:2181", "test");
			lock.lock();
			// do something...
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (lock != null) {
				lock.unlock();
			}
		}
	}
}
