#ifndef _CIRCLE_H_
#define _CIRCLE_H_

#include <iostream>
#include "Shape.h"

class Circle: public Shape {
	public:
	Circle(double radius);
	std::string name() override;
	double area() override;

	private:
	double radius;
};

#endif
