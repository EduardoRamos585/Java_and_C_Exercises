#include <iostream>
#include <vector>

int main(int argc, char* argvs[])
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

  for(auto i : UpperCap)
  {
    std::cout << i << std::endl;
  }

  std::cout << "\nUncapitalized " << std::endl;

  for(auto v : *LowerCap)
  {
    std::cout << v << std::endl;
  }





}

