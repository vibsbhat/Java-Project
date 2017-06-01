public class Rectangulator {
  public static void main(String[] args) {
    int length = Integer.parseInt(args[0]);
    int width = Integer.parseInt(args[0]);
    
    Rectange myRectange = new Rectangle(length,width);
    String output = String.format("*** Your Retangle ***\n\nLength: %d\nWidth: %d\nArea: %d\nPerimeter: %d\n\n", myRectangle.length,myRectangle.width, myRectangle.getArea(), myRectangle.getPerimeter());
    System.out.println(output);
  }
}    
