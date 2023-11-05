

#include "Circle.h"



Circle::Circle(double radius)
	: radius(radius) {}

std::string Circle::name()
{
  return std::to_string(radius) + " Circle";
}



double Circle::area()
{
  double pi = M_PI;
  double area = pi * (radius * radius);
  return area;
}



