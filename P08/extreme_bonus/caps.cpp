#include <iostream>
#include <vector>
#include <algorithm>


bool naturalOrder( std::string &a , std::string &b) {return a<b;}

bool SortbyLength(std::string &a, std::string &b) {return a.length() == b.length() ? a<b : a.length() < b.length();}


int main (int argc, char* argvs[])
{
  std::vector<std::string> UpperCap;
  std::vector<std::string> *LowerCap = new std::vector<std::string>;


  for (int i = 0; i<argc; i++)
  {
    if(i >0)
    {
       if((argvs[i][0] > 64 ) && (argvs[i][0] < 91))
       {
          std::string a = argvs[i];
	  UpperCap.push_back(a);
       }
       else
       {
	  std::string b = argvs[i];
	  LowerCap->push_back(b);
       }


    }
  }

  std::cout << "\nCapitalized " << std::endl;

  std::sort(UpperCap.begin(), UpperCap.end(),naturalOrder);

  for(auto i : UpperCap)
  {
    std::cout << i << std::endl;
  }

  std::cout << "\nUncapitalized " << std::endl;

  std::sort(LowerCap->begin(), LowerCap->end(), SortbyLength );

  for(auto v : *LowerCap)
  {
    std::cout << v << std::endl;
  }





}

