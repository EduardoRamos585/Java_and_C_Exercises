#ifndef _SHAPE_H_
#define _SHAPE_H_

#include <iostream>


class Shape{
	public:
	virtual std::string name();
	virtual double area();
        std::string to_string();
};

#endif
