/*6.	Write a program and perform the following:
a)	Define class “ROOM”.
b)	Define data Members as :
i.	Length
ii.	Width
iii.	Height
c)	Define constructors as per requirement.
d)	Define methods as :
i.	Float whiteWashingArea() to compute the area to be whitewashed.
ii.	Int whiteWashingCost() to compute the cost of whitewashing at the rate of Rs.80 per sq.ft
iii.	Int flooringCost() to compute the cost of flooring at the rate of Rs200/-sq.ft for geometric flooring and at the rate of Rs100 /- sq.ft 
for cement flooring.
iv.	Test this class by creating an object for the class Room and compute the cost for respective methods
*/


package methodsquestions;

public class Room {
	int length,width,height;
	int area;
	int cost;
	int areaoffourwalls;
	int areaofceiling;
	int flooringarea,geometric,cement;
	void whiteWashingArea()
	{
		length=20;
		width=30;
		height=10;
		areaoffourwalls=2*height*(length+width);
		areaofceiling=length*width;
		area=areaoffourwalls+areaofceiling;
		System.out.println("area to bo whitewashed:"+area);
	}
	void whiteWashingCost()
	{
		cost=area*80;
		System.out.println("the cost of white washing of room  is:"+cost);
	}
	void flooringCost()
	{
		flooringarea=2*(length+width);
		geometric=flooringarea*200;
		cement=flooringarea*100;
		System.out.println("the cost of geometric flooring of room  is:"+geometric);
		System.out.println("the cost of cement flooring of room  is:"+cement);
		
	}

}
