package org.system;
public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("Desktop size - 768×1024");

	}

	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.computerModel();
		d.desktopSize();

	}

}