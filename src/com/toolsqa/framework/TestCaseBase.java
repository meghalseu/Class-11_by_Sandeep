package com.toolsqa.framework;

public abstract class TestCaseBase implements IFrameworkTestCase {

	@Override
	public void setup() {
		// Login
	}

	@Override
	public abstract void run();
	
	@Override
	public void cleanup() {
		// Logout
	}
}
