#include "Shape.h"


virtual std::string Shape::name()
{
  return "Shape";
}


virtual double Shape:area()
{
  return 0.0;
i}

std::string Shape::to_string()
{
  return Shape::name + "with area " + std::to_string(Shape::area) + '\n';
}


