/* с. 107
Пример использования цикла While
для вывода на экран букв английского алвафита
*/

class WhileDemo {

public static void main (String args []) {
	
	char ch = 'a';
	
	System.out.println ("Пример использования цикла While\nдля вывода на экран букв английского алвафита\n");
	
	while (ch < 'z') {
		System.out.println (ch);
	ch++;
	}
}

}