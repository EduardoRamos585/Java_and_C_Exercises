#ifndef _RECTANGLE_H 
#define _RECTANGLE_H

#include <iostream>
#include "Shape.h"

class Rectangle: public Shape {
	public :
	  Rectangle(double height, double width);
	  std::string name() override ;
	  double area() override;

	protected:
	  double height, width;

};

#endif
