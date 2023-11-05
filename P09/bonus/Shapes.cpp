#include <iostream>
#include <vector>
#include "Shape.h"
#include "Circle.h"
#include "Rectangle.h"

int main (void)
{



std::vector<Shape*>shapes = {new Rectangle{3,3}, new Circle{3.4}};


  for(auto a : shapes)
  {
     std::cout<<a->to_string()<<std::endl;
  }


std::cout << std::endl;

}

