package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shape=in.next();
		int R=in.nextInt();
		int G=in.nextInt();
		int B=in.nextInt();
		Color hahaha = new Color(R, G, B);
		Boolean tf=in.nextBoolean();
		double x1=in.nextDouble();
		double y1=in.nextDouble();
		double x2=in.nextDouble();
		double y2=in.nextDouble();
		double x3=in.nextDouble();
		double y3=in.nextDouble();
		StdDraw.setPenColor(hahaha); //or use a custom color here!
        double[] xVertices = { x1, x2, x3 };
        double[] yVertices = { y1, y2, y3 };
	     StdDraw.filledPolygon(xVertices, yVertices);
		//StdDraw.filledSquare(0.5, 0.5, 0.2);
	}
}
