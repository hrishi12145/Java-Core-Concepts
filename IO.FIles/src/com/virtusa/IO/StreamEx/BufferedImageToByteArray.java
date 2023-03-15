package com.virtusa.IO.StreamEx;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;

import javax.imageio.ImageIO;
// Read a image file using buffered byte array and write to another file without loosing the original contents
public class BufferedImageToByteArray {

	public static void main(String[] args) throws Exception {
		// read the image from the file
		BufferedImage image = ImageIO.read(new File("C:\\Users\\HRISHI\\OneDrive\\Documents\\bat wallpaper.jpg"));

		// create the object of ByteArrayOutputStream class
		ByteArrayOutputStream outStreamObj = new ByteArrayOutputStream();

		// write the image into the object of ByteArrayOutputStream class
		ImageIO.write(image, "jpg", outStreamObj);

		// create the byte array from image
		byte[] byteArray = outStreamObj.toByteArray();

		// create the object of ByteArrayInputStream class
		// and initialized it with the byte array.
		ByteArrayInputStream inputStreamObj = new ByteArrayInputStream(byteArray);

		// read image from byte array
		BufferedImage newImage = ImageIO.read(inputStreamObj);

		// write output image
		ImageIO.write(newImage, "jpg", new File("C:\\\\Users\\\\HRISHI\\\\OneDrive\\\\Documents\\outputImage.jpg"));
		System.out.println("Image generated from the byte array.");
	}

}
