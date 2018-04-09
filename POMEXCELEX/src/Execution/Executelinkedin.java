package Execution;

import org.testng.annotations.Test;

import Operation.Loginoperationlinkedin;

import Repository.Openlinkedin;

public class Executelinkedin {
	@Test
	public void EXe() throws Exception {
		Openlinkedin.Browser();
		Openlinkedin.opeen();
		Loginoperationlinkedin.excel();
		System.out.println("hello");
	}

}
