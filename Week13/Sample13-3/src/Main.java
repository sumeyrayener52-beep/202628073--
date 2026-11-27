void main() throws IOException {
    int radius;
    double area;

    radius = Input.readData("원의 반지름");   //Call by Name

    area = Compute.circleArea(radius);   // Call by Value

    Output.display("원의 반지름", radius);  // Call by Value
    Output.display("원의 면적", area); // Call by Value
}