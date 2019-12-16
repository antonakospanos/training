package com.antonakospanos.oca.m09exceptions.examples;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class CheckedExceptionHandling {
	
	public static void handleResources() throws MyCheckedException {
		try (MyResource m = new MyResource()) {
			// Happy path code
		} catch (IOException ioe) {
			// Handling of checked exception
			throw new MyCheckedException("Execution "
					+ "using MyResource failed casue: ", ioe);
		} finally {
			// Final execution along with resources release!
		}
	}
	
	public static void handleSocketResources() throws MyCheckedException {
		try (Socket s = new Socket();	InputStream is = s.getInputStream()) {
			// Happy path code
		} catch (IOException ioe) {
			// Handling of checked exception
			throw new MyCheckedException("Execution "
					+ "usinng network socket failed casue: ", ioe);
		} finally {
			// Final execution along with resources release!
		}
	}
}
