package com.test;

public class Main {
//测试，test ,test2  我再加点来制造冲突问题
	DistributedLock lock = null;
	public static void main(String[] args) {
		Main main = new Main();
		main.test();
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