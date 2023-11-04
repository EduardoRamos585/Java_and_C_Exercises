#include <iostream>
#include <vector>
#include "Shape.h"
#include "Circle.h"
#include "Rectangle.h"

int main (void)
{

std::vector<Shape*> shapes = {Circle{1.28}};

  for(auto a : shapes)
  {
     std::cout<<a->to_string()<<std::endl;
  }

}

