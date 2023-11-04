#include "Rectangle.h"



Rectangle::Rectangle(double height , double width)
	 : height{height}, width{width} {}


std::string Rectangle::name() override
{
  return std::to_string(height) + " x " + std::to_string(width) + " Rectangle";
}

double Rectangle::area() override
{
   double area = height * width;

   return area;
}


