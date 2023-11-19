#ifndef _INDEX_H_
#define _INDEX_H_
#include "Location.h"
#include <set>
#include <map>

typedef std::string Word;
typedef std::set<Location> Locations;

class Index{

	public:
	void add_word(Word word, std::string filename, int line);
	friend std::ostream& operator<<(std::ostream& ost, const Index& index);

	private:
	std::map<Word, Locations> _index;
	
};

#endif

