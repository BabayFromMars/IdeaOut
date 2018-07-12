package myPack;

public class Box {
    double width, height, depth;

    //Meth for value
//    void volume() {
//        System.out.print("Volume is ");
//        System.out.println(width*depth*height);

    double volume() {
        return width * height * depth;


    }
    //Constructor for Boxes
Box (double w, double h, double d){
        width = w;
        height = h;
        depth = d;
}


    }



