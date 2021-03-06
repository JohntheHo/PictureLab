/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  public static void testMirrorVerticalRighttoLeft()
  {
      Picture caterpillar = new Picture("caterpillar.jpg");
      caterpillar.explore();
      caterpillar.mirrorVerticalRighttoLeft();
      caterpillar.explore();
   }
    
  public static void testMirrorHorizontal()
  {
      Picture caterpillar = new Picture("caterpillar.jpg");
      caterpillar.explore();
      caterpillar.mirrorHorizontal();
      caterpillar.explore();
 
  }
   
  public static void testMirrorHorizontalToptoBot()
  {
      Picture caterpillar = new Picture("caterpillar.jpg");
      caterpillar.explore();
      caterpillar.mirrorHorizontal();
      caterpillar.explore();
  }
  public static void testMirrorDiagonal()
  {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.mirrorDiagonal();
      beach.explore();
  }
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  public static void testMirrorArms()
  {
      Picture snowman = new Picture("snowman.jpg");
      snowman.explore();
      snowman.mirrorArms();
      snowman.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.explore();
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testkeepOnlyBlue()
  {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
      
      
  }
  public static void testgrayscale()
  {
    Picture beach = new Picture("beach.jpg");
      beach.explore();
    beach.grayscale();
    beach.explore();
  }
  public static void testnegate()
  {
     Picture beach = new Picture("beach.jpg");
      beach.explore();
    beach.negate();
    beach.explore();
  }
  
  public static void testCopy()
  {
      Picture beach = new Picture("beach.jpg");
      Picture snowman = new Picture("snowman.jpg");
      beach.explore();
      beach.copy(snowman,100,100,150,150,225,225);
      beach.explore();
  }
 
    
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testZeroBlue();
    testkeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    testnegate();
    testgrayscale();
    //testFixUnderwater();
    testMirrorVertical();
    testMirrorVerticalRighttoLeft();
    testMirrorHorizontal();
    testMirrorHorizontalToptoBot();
    testMirrorDiagonal();
    testMirrorTemple();
    testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    testCollage();
    testCopy();
    testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}