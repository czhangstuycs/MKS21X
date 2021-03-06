public class Triangle{
    /*                                                                                                            
     *Instance Variables                                                                                          
     */
    private Coordinate v1,v2,v3;

    public Triangle(){}

    //1 
    public Triangle(Coordinate a,Coordinate b, Coordinate c)
    {

	v1 = a;
	v2 = b;
	v3 = c;

    }

    

    //2
    public Triangle(double x1,double y1,double x2,double y2,double x3,double y3)
    {
	v1 = new Coordinate(x1,y1);
	v2 = new Coordinate(x2,y2);
	v3 = new Coordinate(x3,y3);


    }

    //3
    public String toString(){
        return "Triangle!\n Area = " + getArea() + "\n Perimeter = " + getPerimeter();
    }

    //4
    public double getPerimeter(){
        return v1.dist(v2) + v1.dist(v3) + v2.dist(v3);
    }

    //5  (use Heron's formula)
    public double getArea(){
	double s = this.getPerimeter()/2;
	double a = v1.dist(v2);
	double b = v1.dist(v3);
	double c = v2.dist(v3);
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    //6 use your smarts, remember for booleans || is or, && is and.
    //e.g.    x > 0 || x < 0
    public boolean isRight(){
	double a = v1.dist(v2);
	double b = v1.dist(v3);
	double c = v2.dist(v3);

	double inner1 = (v1.getX()-v3.getX())*(v2.getX()-v3.getX()) + (v1.getY()-v3.getY())*(v2.getY()-v3.getY());

	double inner2 = (v1.getX()-v2.getX())*(v3.getX()-v2.getX()) + (v1.getY()-v2.getY())*(v3.getY()-v2.getY());

	double inner3 = (v2.getX()-v1.getX())*(v3.getX()-v1.getX()) + (v2.getY()-v1.getY())*(v3.getY()-v1.getY());
//	System.out.println(a+","+b+","+c);
        return (inner1==0) || (inner2==0) || (inner3==0);
    }

}

