#ifndef _CIRCLE_H_
#define _CIRCLE_H_

#include <iostream>

class Circle: public Shape{
	public:
	Circle(double radius);
	std::string name();
	double area();

	private:
	double radius;
};

#endif
