

#include "Circle.h"



Circle::Circle(double radius)
	: radius(radius) {}

std::string Circle::name() override
{
  return std::to_string(radius) + " Circle";
}

double Circle::area() override
{
  double pi = 3.141593;
  double area = pi * (radius * radius);
  return area;
}
