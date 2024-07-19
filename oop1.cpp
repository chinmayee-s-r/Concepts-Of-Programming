#include<iostream>
using namespace std;

// class declaration
class Demo{

    public:              // Access Specifier
        int no1 = 11;    // Characteristics
        int no2 = 21;    // Characteristics

    Demo(){         // Constructor - Behaviour

        cout<<"Inside Constructor\n";
    }
    ~Demo(){        // Destructor - Behaviour

        cout<<"Inside Destructor\n";
    }
    void Fun(){     // Behaviour

        cout<<"Inside Fun of Demo Class\n";
    }
};

int main(){

    cout<<"Inside Main\n";
    Demo obj1;
    cout<<"Size of object is : "<<sizeof(obj1)<<"\n";
    cout<<"Value of no1 : "<<obj1.no1<<"\n";
    cout<<"Value of no2 : "<<obj1.no2<<"\n";
    obj1.Fun();

    return 0;
}