public class Cylinder extends Shape
{
   private double radius;  //radius in feet
   private double height;   //height in feet

   //----------------------------------
   //  Constructor: Sets up the cylinder.
   //----------------------------------
   public Cylinder(double r, double h)
   {
      radius = r;
      height = h;
   }

   //-----------------------------------------
   //  Returns the area of the rectangle.
   //-----------------------------------------
   public double area()
   {
       return Math.PI*radius*Math.sqrt(2)*height;
   }

   //-----------------------------------
   //  Returns the rectangle as a String.
   //-----------------------------------
   public String toString()
   {
       return super.toString() + " of radius " + radius + " and height " + height;
   }

}
