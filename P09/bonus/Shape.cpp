#include "Shape.h"


std::string Shape::to_string()
{
  return name() + " has area of " + std::to_string(area());
}



