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
	std::cout << ::a << std::endl; //::a �� ������Ī ������ �ǹ�
	std::cout << a << std::endl; //a �� ���������ν� int a = 40; �� �����ٸ� ����!
	std::cout << NameSpace1::b << std::endl;

	cout << NameSpace1::a << endl;
	cout << NameSpace2::a << endl;
	cout << ::a << endl; //::a �� ������Ī ������ �ǹ�
	cout << a << endl; //a �� ���������ν� int a = 40; �� �����ٸ� ����!
	cout << NameSpace1::b << endl;
	return 0;

	
}