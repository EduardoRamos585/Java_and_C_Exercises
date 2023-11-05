#ifndef _CIRCLE_H_
#define _CIRCLE_H_

#ifndef M_PI
#define M_PI (3.14159265358979323846)
#endif

#include <cmath>

#include <iostream>

#include "Shape.h"

class Circle: public Shape {
	public:
	Circle(double radius);
	std::string name() override;
	double area() override;

	protected:
	double radius;
};

#endif
