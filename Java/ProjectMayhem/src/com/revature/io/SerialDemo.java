package com.revature.io;

public class SerialDemo {

	public static void main(String[] args) {
		IO io = new IO();
		String a="banana";
		/*if output.txt does not exist, it will create it!
		 * If it doesnt exist, run it, and then refresh the project
		 * explorer to see it
		 * 
		 */
		//io.writeOutputStreamContents("Actuallly, Lady Gaga is a "+ a);
		
		System.out.println(io.readInputStreamContents());
	}

}
