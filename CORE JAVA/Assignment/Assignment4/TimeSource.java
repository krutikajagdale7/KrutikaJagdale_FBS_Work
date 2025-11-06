class Time{
int hr, min, sec;

Time(int hr, int min, int sec){
this.hr = hr;
this.min = min;
this.sec = sec;
}

Time add(Time t){
int totalsec = this.sec + t.sec;
int totalmin = this.min + t.min + (totalsec/60);
int totalhour = this.hr+t.hr + (totalmin/60) ;

totalsec %= 60;
totalmin %= 60;
totalhour %=24;
return new Time(totalhour,totalmin,totalsec);
}
Time add(int addHr, int addMin, int addSec){
int totalsec = this.sec +addSec;
int totalmin = this.min +addMin + (totalsec/60);
int totalhour = this.hr +addHr + (totalmin/60);
totalsec %= 60;
totalmin %= 60;
totalhour  %= 24;
return new Time(totalhour,totalmin,totalsec);


}
void Display()
{
System.out.println(hr+":"+min+":"+sec);
}
 

}//time end here
class Test{
public static void main(String[]args){

Time t1 = new Time(10,45,55);
Time t2 = new Time(5,30,20);
Time t3 = t1.add(t2);

System.out.println("sum of two time object :");
t3.Display();
Time t4 = t1.add(2,15,50);
System.out.println("After Adding hr,  min , sec :");
t4.Display();



}//main end here
}//test end here
