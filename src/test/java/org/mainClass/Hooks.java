package org.mainClass;

import java.io.IOException;

import org.commons.CommonActions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommonActions{
	CommonActions c= new CommonActions();
@Before
public void launch() throws IOException {
	c.launched();
}
@After
public void closed() {
	c.closed();
}
}
