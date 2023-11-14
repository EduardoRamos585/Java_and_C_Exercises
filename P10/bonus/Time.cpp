#include "Time.h"
#include <cstdio>
#include <ios>
#include <sstream>
//#include <iomanip>


Time::Time(int hour, int minute, int second)
	:_hour(hour), _minute(minute), _second(second) {
	rationalize();
	}


Time Time::operator+(Time time){
       
	int new_hour = this->_hour + time._hour;
	int new_minute = this->_minute + time._minute;
	int new_second = this->_second + time._second;

  Time new_time{ new_hour, new_minute, new_second};

  return new_time;

	

}

Time::Time() : _hour(0), _minute(0), _second(0) {}

Time Time::operator+(int seconds) const {
    int total = (this->_hour *3600) + (this->_minute * 60) + (this->_second) + seconds;

    int hour = (total/3600);
    int minute = (total % 3600) / 60;
    int second = total % 60;


    return Time{hour, minute, second};
}


Time operator+(int seconds, Time& time)
{
    int total = (time._hour * 3600) + (time._minute * 60) + (time._second + seconds);

    int hour = total / 3600;
    int minute = (total % 3600) / 60;
    int second = total % 60;

    return Time(hour, minute, second);

}



std::ostream& operator<<(std::ostream& os , const Time& time)
{
  char string[20];

  snprintf(string, sizeof(string), "%02d:%02d:%02d", time._hour,time._minute,time._second);

  os << string;

  return os;
}


 Time& Time::operator++()
{
  ++this->_second;

  rationalize();

 return *this;


}

 Time Time::operator++(int)
{
  rationalize();
  Time time{*this};
  ++*this;

 return time;
}

bool Time::operator==(const Time& time){

 if((this->_hour > time._hour) || (this->_hour < time._hour)) return false;
 if((this->_minute > time._minute) || (this->_minute < time._minute)) return false;
 if((this->_second > time._second) || (this->_second < time._second)) return false;

  return true;

}

bool Time::operator!=(const Time& time){
if((this->_hour > time._hour) || (this->_hour < time._hour)) return true;
if((this->_minute > time._minute) || (this->_minute < time._minute)) return true;
if((this->_second > time._second) || (this->_second < time._second)) return true;

return false;


}

bool Time::operator<(const Time& time){

if(this->_hour < time._hour )
{
  return true;
}

if(this->_minute < time._minute && (this->_hour <= time._hour) )
{
  return true;
}

if((this->_second < time._second) && (this->_minute <= time._minute) && (this->_hour <= time._hour))
{
  return true;
}
else
{
  return false;
}


}

bool Time::operator>(const Time& time){

if(this->_hour > time._hour )
{
  return true;
}

if(this->_minute > time._minute && (this->_hour >= time._hour) )
{
  return true;
}

if((this->_second > time._second) && (this->_minute >= time._minute) && (this->_hour >= time._hour))
{
  return true;
}
else
{
  return false;
}



}

bool Time::operator<=(const Time& time){


if((this->_second < time._second) || (this->_second == time._second) && (this->_minute <= time._minute) && (this->_hour <= time._hour))
{
  return true;

}
else
{
  return false;
}

}

bool Time::operator>=(const Time& time){



if((this->_second > time._second) || (this->_second == time._second) && (this->_minute >= time._minute) && (this->_hour >= time._hour))
{
  return true;

}
else
{
  return false;
}


}






void Time::rationalize()
{


   

  if((this->_hour == 23) && (this->_minute == 59) && (this->_second == 60))
  {
    this->_hour = 0;
    this->_minute = 0;
    this->_second = 0;
  }
  
	
  if(this->_second >= 60)
  {
    
    int minutes = (this->_second/60);
    this->_minute += minutes;
    this->_second -= (60 * minutes);
  }

  if(this->_minute >= 60)
  {
    int hour = (this->_minute/60);
    this->_hour += hour;
    this->_minute -= (60*hour);
  }


  if(this->_second < 0)
  {
    if(this->_minute >0)
    {

      --this->_minute;
      this->_second = 59;
    }

 }


}

std::istream& operator>>(std::istream& ist ,  Time& time){

char colon;
ist >> time._hour >> colon >> time._minute >> colon>> time._second;
time.rationalize();

return ist;
 


}
