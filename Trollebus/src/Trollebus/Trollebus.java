package Trollebus;
public class Trollebus {
	enum Door {open,close};
	enum Trolleb {on,off};
	enum Electric {on,off};
	int time = -1; //начальное время при котором троллейбус не едет
	      //начальные значения
		Door door = Door.close;
		Trolleb trolleb = Trolleb.off;
		Electric electric = Electric.off;
	
		 void take_door(){ //метод изменяющий положение двери
		if (door == Door.open){
			door = Door.close;
			electric = Electric.off;
			System.out.println("Дверь закрыта");
			}
			else {
			door = Door.open;
			electric = Electric.on;
			System.out.println("Дверь открыта");
			}
		}
		void button_gas(Door door){ //метод обрабатывающий кнопку газа
			if (door == Door.open ){ //если дверь открыта, то ехать нельзя
			trolleb = Trolleb.off;	
			System.out.println("Закройте дверь");
			}
			else { // если двери закрыты
			   if ( trolleb == Trolleb.on){//если троллейбус уже едет
				   time+= 60;
				   System.out.println("Добавлена минута");	
				}
			   else { // если троллейбус не едет
				   trolleb = Trolleb.on; //нажали кнопку газ
				   time = 60; // установили счетчик во врмени
		     	   System.out.println("Троллейбус едет");
	
			}	
			}
		return;
		}
		void stop(){
			trolleb = Trolleb.off; //троллейбус останавливается
			time=-1; //сбрасываем счётчик времени
			System.out.println("Время истекло троллейбус остановился");
		}
	
		public static void main(String[] args){
			// вызов всех методов
		}
			  
}


