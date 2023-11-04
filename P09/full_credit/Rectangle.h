#ifndef _RECTANGLE_H 
#define _RECTANGLE_H

#include <iostream>


class Rectangle: public Shape {
	public :
	  Rectangle(double height, double width);
	  std::string name();
	  double area();

	private:
	  double height, width;

};

#endif
