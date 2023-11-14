#ifndef _TIME_H_
#define _TIME_H_

#include <iostream>


class Time{

	
        private:
        int _hour;
        int _minute;
        int _second;

        void rationalize();




	public:
	Time(int hour = 0 , int minute = 0, int second = 0);
	Time operator+(Time time);
	Time& operator++(); // Pre-Increment
	Time operator++(int); // Post-Increment
	bool operator==(const Time& time);
	bool operator!=(const Time& time);
	bool operator<(const Time& time);
	bool operator>(const Time& time);
	bool operator<=(const Time& time);
	bool operator>=(const Time& time);
	friend std::ostream& operator<<(std::ostream& ost, const Time& time);
	friend std::istream& operator>>(std::istream& ist,  Time& time);
	

};
#endif

