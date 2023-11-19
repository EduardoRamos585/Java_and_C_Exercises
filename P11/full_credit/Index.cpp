#include "Index.h"
#include <vector>

void Index::add_word(Word word, std::string filename, int line)
{
 std::map<Word, Locations>::iterator it;
  it = _index.find(word);

  if(it == _index.end())
  {
    Locations set;

    set.insert(Location{filename,line});

    _index.insert({word, set});
  }
  else
  {
     it->second.insert(Location{filename, line});
  }

}

std::ostream& operator<<(std::ostream& ost, const Index& index)
{

  std::map<Word, Locations>::iterator its;

  for(its = index._index.begin(); its != index._index.end() ; ++its)
  {
    ost << its->first << ':';

    Locations::iterator it_set;
    for(it_set = its->second.begin(); it_set != its->second.end(); ++it_set)
    {
       ost << *it_set << ',';
    }

    ost << std::endl;

  }

return ost;

}

