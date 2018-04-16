/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 * 
 * @author Barbara Ericson
 */
public class PictureTester {
	/** Method to test zeroBlue */
	public static void testZeroBlue() {
		Picture beach = new Picture("/Users/fireguy/Documents/workspace/Unit 16/src/images/beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}

	public static void testZeroRed() {
		Picture beach = new Picture("/Users/fireguy/Documents/workspace/Unit 16/src/images/beach.jpg");
		beach.explore();
		beach.zeroRed();
		beach.explore();
	}

	public static void testZeroGreen() {
		Picture beach = new Picture("/Users/fireguy/Documents/workspace/Unit 16/src/images/beach.jpg");
		beach.explore();
		beach.zeroGreen();
		beach.explore();
	}

	/** Method to test mirrorVertical */
	public static void testMirrorVertical() {
		Picture caterpillar = new Picture("/Users/fireguy/Documents/workspace/Unit 16/src/images/caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorVertical();
		caterpillar.explore();
	}

	/** Method to test mirrorTemple */
	public static void testMirrorTemple() {
		Picture temple = new Picture("/Users/fireguy/Documents/workspace/Unit 16/src/images/temple.jpg");
		temple.explore();
		temple.mirrorTemple();
		temple.explore();
	}

	/** Method to test the collage method */
	public static void testCollage() {
		Picture canvas = new Picture("/Users/fireguy/Documents/workspace/Unit 16/src/images/640x480.jpg");
		canvas.createCollage();
		canvas.explore();
	}

	/** Method to test edgeDetection */
	public static void testEdgeDetection() {
		Picture swan = new Picture("/Users/fireguy/Documents/workspace/Unit 16/src/images/swan.jpg");
		swan.edgeDetection(10);
		swan.explore();
	}

	public static void testKeepOnlyBlue() {
		Picture beach = new Picture("/Users/fireguy/Documents/workspace/Unit 16/src/images/beach.jpg");
		beach.explore();
		beach.keepOnlyBlue();
		beach.explore();
	}

	public static void testKeepOnlyRed() {
		Picture beach = new Picture("/Users/fireguy/Documents/workspace/Unit 16/src/images/beach.jpg");
		beach.explore();
		beach.keepOnlyRed();
		beach.explore();
	}

	public static void testKeepOnlyGreen() {
		Picture beach = new Picture("/Users/fireguy/Documents/workspace/Unit 16/src/images/beach.jpg");
		beach.explore();
		beach.keepOnlyGreen();
		beach.explore();
	}

	public static void testNegate() {
		Picture beach = new Picture("/Users/fireguy/Documents/workspace/Unit 16/src/images/beach.jpg");
		beach.explore();
		beach.negate();
		beach.explore();
	}

	public static void testGrayscale() {
		Picture beach = new Picture("/Users/fireguy/Documents/workspace/Unit 16/src/images/beach.jpg");
		beach.explore();
		beach.grayScale();
		beach.explore();
	}

	public static void testFixUnderwater() {
		Picture beach = new Picture("/Users/fireguy/Documents/workspace/Unit 16/src/images/water.jpg");
		beach.explore();
		beach.fixUnderwater();
		beach.explore();
	}

	public static void testMirrorArms() {
		Picture beach = new Picture("/Users/fireguy/Documents/workspace/Unit 16/src/images/snowman.jpg");
		beach.explore();
		beach.mirrorArms();
		beach.explore();
	}

	public static void testMirrorGull() {
		Picture beach = new Picture("/Users/fireguy/Documents/workspace/Unit 16/src/images/seagull.jpg");
		beach.explore();
		beach.mirrorGull();
		beach.explore();
	}

	public static void testMirrorDiagonal() {
		Picture beach = new Picture("/Users/fireguy/Documents/workspace/Unit 16/src/images/beach.jpg");
		beach.explore();
		beach.mirrorDiagonal();
		beach.explore();
	}

	public static void testCopy() {
		Picture beach = new Picture("/Users/fireguy/Documents/workspace/Unit 16/src/images/beach.jpg");
		beach.explore();
		beach.copy(new Picture("/Users/fireguy/Documents/workspace/Unit 16/src/images/flower1.jpg"), 0, 0);
		beach.explore();
	}

	public static void testBlur() {
		Picture beach = new Picture("/Users/fireguy/Documents/workspace/Unit 16/src/images/beach.jpg");
		beach.explore();
		beach.blur(0, 0, 400, 300);
		beach.explore();
		beach.blur(0, 0, 400, 300);
		beach.explore();
	}

	/**
	 * Main method for testing. Every class can have a main method in Java
	 */
	public static void main(String[] args) {
		// uncomment a call here to run a test
		// and comment out the ones you don't want
		// to run
		// testZeroBlue();
		// testKeepOnlyBlue();
		// testKeepOnlyRed();
		// testKeepOnlyGreen();
		// testNegate();
		// testGrayscale();
		// testFixUnderwater();
		// testMirrorVertical();
		// testMirrorTemple();
		// testMirrorArms();
		// testMirrorGull();
		// testMirrorDiagonal();
		// testCollage();
		// testCopy();
		// testEdgeDetection();
		// testBlur();

		// testEdgeDetection2();
		// testChromakey();
		// testEncodeAndDecode();
		// testGetCountRedOverValue(250);
		// testSetRedToHalfValueInTopHalf();
		// testClearBlueOverValue(200);
		// testGetAverageForColumn(0);
	}
}