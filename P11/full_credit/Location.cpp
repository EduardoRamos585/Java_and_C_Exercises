#include "Location.h"
#include <fstream>
#include <cstring>

Location::Location(std::string filename, int line) :
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


bool Location::operator==(const Location& location)
{

 if((strcmp(this->_filename,location._filename) == 0)
 {
    if(this->line == location._line)
    {
       return true;
    }
    else
    {
      return false;
    }


 }

return false;


}

