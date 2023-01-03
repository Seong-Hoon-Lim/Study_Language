#include <iostream>
using namespace std;
namespace NameSpace1 { int a = 10; }
namespace NameSpace2 { int a = 20; }
int a = 30;
namespace NameSpace1 { int b = 50; }
int main_NameSpace()
{
	int a = 40;
	std::cout << NameSpace1::a << std::endl;
	std::cout << NameSpace2::a << std::endl;
	std::cout << ::a << std::endl; //::a 는 전역명칭 공간을 의미
	std::cout << a << std::endl; //a 는 지역변수로써 int a = 40; 이 없었다면 오류!
	std::cout << NameSpace1::b << std::endl;

	cout << NameSpace1::a << endl;
	cout << NameSpace2::a << endl;
	cout << ::a << endl; //::a 는 전역명칭 공간을 의미
	cout << a << endl; //a 는 지역변수로써 int a = 40; 이 없었다면 오류!
	cout << NameSpace1::b << endl;
	return 0;

	
}