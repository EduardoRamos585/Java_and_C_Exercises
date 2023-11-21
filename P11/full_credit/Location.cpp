#include "Location.h"
#include <fstream>
#include <cstring>

Location::Location(std::string filename, int line) 
	:_filename(filename), _line(line) {
	
if(filename == "")
{
  throw std::runtime_error("No filename provided");
}

std::ifstream check(filename);

if(!check)
{
 throw std::runtime_error("Could not find file");	
}
	
if(line <= 0)
{
 throw std::runtime_error("No such line exists");
}

}

bool Location::operator==(const Location& location) const
{

  return _filename == location._filename && _line == location._line;
}

bool Location::operator!=(const Location& location) const
{

 return !(*this == location);

}

bool Location::operator<(const Location& location) const
{
  if((this->_filename.compare(location._filename)) <0)
   {
     return _line < location._line;
   }

   return _filename < location._filename;
}

bool Location::operator>(const Location& location) const
{
   return location < *this;

}

bool Location::operator<=(const Location& location) const
{
  if((this->_filename.compare(location._filename)) <0 || ((this->_filename.compare(location._filename) == 0)))
   {
    if(this->_line <= location._line)
    {
       return true;
    }
    else
    {
      return false;
    }


  }
  else
  {
    return false;
  }

}

bool Location::operator>=(const Location& location) const
{
  if((this->_filename.compare(location._filename)) >0 || ((this->_filename.compare(location._filename) == 0)))
   {
    if(this->_line >= location._line)
    {
       return true;
    }
    else
    {
      return false;
    }


  }
  else
  {
    return false;
  }

}


std::ostream& operator<<(std::ostream& ost, const Location& location)
{
  ost << location._filename << " Line " << location._line;

  return ost;
}



