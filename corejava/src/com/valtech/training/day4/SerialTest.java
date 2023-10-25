package com.valtech.training.day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.valtech.training.day1.Point;
import com.valtech.training.day1.Point3D;

public class SerialTest {

	public static void main(String[] args) throws Exception {
		Point p = new Point(2, 3);
		System.out.println(p);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("objects")));
		oos.writeObject(p);
		oos.flush();
		oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("objects")));
		Point p1 = (Point) ois.readObject();
		System.out.println(p1);
		System.out.println(p == p1);

		// For 3D class
		Point p3 = new Point3D(10, 20, 30);
		System.out.println(p3);
		ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream(new File("objects")));
		oos1.writeObject(p3);
		oos1.flush();
		oos1.close();
		ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream(new File("objects")));
		Point p4 = (Point) ois2.readObject();
		System.out.println(p4);
		System.out.println(p3 == p4);

	}

}
