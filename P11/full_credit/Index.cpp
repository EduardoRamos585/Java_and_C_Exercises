#include "Index.h"
#include <vector>

void Index::add_word(Word word, std::string filename, int line)
{
 std::map<Word, Locations>::iterator it;
  it = _index.find(word);

  if(it == _index.end())
  {
   Locations() = _index[word];
  }
  else
  {
     _index[word].insert(Location(filename,line));
  }

}

std::ostream& operator<<(std::ostream& ost, const Index& index)
{

 for(const auto& entry : index._index)
 {
   ost << entry.first << ": ";
   for(const auto& location : entry.second)
   {
     ost << location << " , ";
   }

   ost << std::endl;

 }

 return ost;
}

