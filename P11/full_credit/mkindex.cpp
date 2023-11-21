#include <iostream>
#include <fstream>
#include <sstream>
#include <vector>
#include <map>
#include <cctype>
#include "Index.h"
#include "Location.h"

std::string removePunctuation(const std::string& word) {
    std::string result = word;

    while (!result.empty() && ispunct(result.front())) {
        result.erase(0, 1);
    }

    while (!result.empty() && ispunct(result.back())) {
        result.pop_back();
    }

    return result;
}

std::string toLowercase(const std::string& word) {
    std::string result = word;

    for (char& c : result) {
        c = tolower(c);
    }

    return result;
}


int main(int argc, char* argv[]) {
    if (argc < 2) {
        std::cerr << "Usage: " << argv[0] << " <filename1> <filename2> ..." << std::endl;
        return 1;
    }

    Index index;

    for (int i = 1; i < argc; ++i) {
        std::ifstream file(argv[i]);

        if (!file.is_open()) {
            std::cerr << "Error opening file: " << argv[i] << std::endl;
            continue;
        }

        std::string line;
        int lineNumber = 1;

       
        while (std::getline(file, line)) {
            std::istringstream iss(line);
            std::string word;

            
            while (iss >> word) {
                index.add_word(word, argv[i], lineNumber);
            }

            lineNumber++;
        }

        file.close();
    }

    std::cout << index;

    return 0;
}
