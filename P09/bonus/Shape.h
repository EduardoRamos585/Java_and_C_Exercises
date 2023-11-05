#ifndef _SHAPE_H_
#define _SHAPE_H_

#include <iostream>


class Shape{
	public:
	 virtual std::string name() = 0;
	 virtual double area() = 0;
	 std::string to_string();
};

#endif
