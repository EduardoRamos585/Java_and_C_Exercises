#include <iostream>
#include <vector>

int main(int argc, char* argvs[])
{
  std::vector<char*> UpperCap;
  std::vector<char*> *LowerCap = new std::vector<char*>;


  for (int i = 0; i<argc; i++)
  {
    if(i >0)
    {
       if((argvs[i][0] > 64 ) && (argvs[i][0] < 91))
       {
          char * a = argvs[i];
	  UpperCap.push_back(a);
       }
       else
       {
          char * b = argvs[i];
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

