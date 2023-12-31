#ifndef _LOCATION_H_
#define _LOCATION_H_

#include <iostream>

class Location{
	public:
	Location(std::string filename , int line);
	bool operator==(const Location& location)const;
	bool operator!=(const Location& location)const;
	bool operator<(const Location& location)const;
	bool operator>(const Location& location)const;
	bool operator<=(const Location& location)const;
	bool operator>=(const Location& location)const;
	friend std::ostream& operator<<(std::ostream& ost, const Location& location);

	private:
	std::string _filename;
	int _line;

};

#endif

