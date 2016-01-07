package com.test;

public class Main {
//我来测试更改一下 ，没什么变化
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
