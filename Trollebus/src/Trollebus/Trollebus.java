package Trollebus;
public class Trollebus {
	enum Door {open,close};
	enum Trolleb {on,off};
	enum Electric {on,off};
	int time = -1; //��������� ����� ��� ������� ���������� �� ����
	      //��������� ��������
		Door door = Door.close;
		Trolleb trolleb = Trolleb.off;
		Electric electric = Electric.off;
	
		 void take_door(){ //����� ���������� ��������� �����
		if (door == Door.open){
			door = Door.close;
			electric = Electric.off;
			System.out.println("����� �������");
			}
			else {
			door = Door.open;
			electric = Electric.on;
			System.out.println("����� �������");
			}
		}
		void button_gas(Door door){ //����� �������������� ������ ����
			if (door == Door.open ){ //���� ����� �������, �� ����� ������
			trolleb = Trolleb.off;	
			System.out.println("�������� �����");
			}
			else { // ���� ����� �������
			   if ( trolleb == Trolleb.on){//���� ���������� ��� ����
				   time+= 60;
				   System.out.println("��������� ������");	
				}
			   else { // ���� ���������� �� ����
				   trolleb = Trolleb.on; //������ ������ ���
				   time = 60; // ���������� ������� �� ������
		     	   System.out.println("���������� ����");
	
			}	
			}
		return;
		}
		void stop(){
			trolleb = Trolleb.off; //���������� ���������������
			time=-1; //���������� ������� �������
			System.out.println("����� ������� ���������� �����������");
		}
	
		public static void main(String[] args){
			// ����� ���� �������
		}
			  
}


